package com.levelup;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {


    private static void read() throws SQLException {
        List<Person> people = new ArrayList<>();
        try (Connection connection = DBConector.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM person ORDER BY id");
             ResultSet rs = preparedStatement.executeQuery()) {
            while (rs.next()) {
                Person person = new Person();
                person.setPersonID(rs.getInt("id"));
                person.setFirstName(rs.getString("first_name"));
                person.setLastName(rs.getString("last_name"));
                person.setAdress(rs.getString("address"));
                person.setCity(rs.getString("city"));
                people.add(person);
            }
        }
        System.out.println("size= " + people.size());
        System.out.println(people.toString());
    }

    private static boolean create(Person person) throws SQLException {
        try (Connection connection = DBConector.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT into person " +
                     "values(?,?,?,?,?)")) {
            preparedStatement.setInt(1, person.getPersonID());
            preparedStatement.setString(2, person.getFirstName());
            preparedStatement.setString(3, person.getLastName());
            preparedStatement.setString(4, person.getAdress());
            preparedStatement.setString(5, person.getCity());
            if (preparedStatement.executeUpdate() > 0) {
                System.out.println("Add success");
                return true;
            }
        }
        return false;
    }

    private static boolean deleteByID(Integer integer) throws SQLException {
        try (Connection connection = DBConector.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("delete from person where id = " + integer)) {
            if (preparedStatement.executeUpdate() > 0)
                return true;
            return false;
        }
    }

    private static boolean deleteByPerson(Person person) throws SQLException {
        try (Connection connection = DBConector.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("delete from person where id = ?")) {
            preparedStatement.setInt(1, person.getPersonID());
            if (preparedStatement.executeUpdate() > 0) {
                return true;
            }
            return false;
        }
    }

    private static boolean update(Person person) throws SQLException {
        try (Connection connection = DBConector.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("UPDATE person SET " +
                     "first_name = ?, last_name = ?, address = ?, city = ?" +
                     "WHERE id =?")) {
            preparedStatement.setString(1, person.getFirstName());
            preparedStatement.setString(2, person.getLastName());
            preparedStatement.setString(3, person.getAdress());
            preparedStatement.setString(4, person.getCity());
            preparedStatement.setInt(5, person.getPersonID());
            if (preparedStatement.executeUpdate() > 0) {
                System.out.println("update success");
                return true;
            }
        }
        return false;

    }

    /*private static Person findByID(int id) throws SQLException {
        Person person = new Person();
        try (Connection connection = DBConector.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM person WHERE id=?")) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            rs.next();
            person.setPersonID(rs.getInt("id"));
            person.setFirstName(rs.getString("first_name"));
            person.setLastName(rs.getString("last_name"));
            person.setAdress(rs.getString("address"));
            person.setCity(rs.getString("city"));
        }
        System.out.println(person.toString());
        return person;
    }*/

    public static int[] addPeople(List<Person> people) throws SQLException {
        Connection conn = null;
        PreparedStatement pc = null;
        try {
            conn = DBConector.getInstance().getConnection();
            conn.setAutoCommit(false);
            pc = conn.prepareStatement("INSERT INTO person " + "values(?,?,?,?,?)");
            for (Person person : people) {
                pc.setInt(1, person.getPersonID());
                pc.setString(2, person.getFirstName());
                pc.setString(3, person.getLastName());
                pc.setString(4, person.getAdress());
                pc.setString(5, person.getCity());
                pc.addBatch();
            }
            int[] res = pc.executeBatch();
            conn.commit();
            return res;
        } catch (Exception ex) {
            ex.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } finally {
            try {
                if (pc != null && !pc.isClosed()) {
                    pc.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return new int[]{};

    }

    public static void main(String[] args) throws SQLException {
        //create(new Person(3, "Dima", "P", "sherbina", "dnipro"));
        //read();
        //deleteByID(4);
        //read();
        //create(new Person(4, "Dima", "P", "sherbina", "dnipro"));
        //update(new Person(1, "Valera", "Time", "kirova str.", "Dnepr"));
        //deleteByPerson(new Person(4, "f", "f", "f", "j"));
        //findByID(1);
        //read();
        addPeople(Arrays.asList(
                new Person(10, "Dima", "P", "sherbina", "dnipro"),
                new Person(11, "Dima", "P", "sherbina", "dnipro"),
                new Person(12, "Dima", "P", "sherbina", "dnipro"),
                new Person(13, "Dima", "P", "sherbina", "dnipro")));
        read();

    }
}
