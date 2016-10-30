package com.levelup;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws SQLException {
        //create(new Person(4,"Dima","P","sherbina","dnipro"));
        //read();
        delete(4);
        read();
    }

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
        System.out.println(people.size());
        System.out.println("OK");
        System.out.println(people.toString());
    }

    private static void create(Person person) throws SQLException {
        try (Connection connection = DBConector.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT into person " +
                     "values(?,?,?,?,?)"))
        {
        preparedStatement.setInt(1, person.getPersonID());
            preparedStatement.setString(2,person.getFirstName());
            preparedStatement.setString(3,person.getLastName());
            preparedStatement.setString(4,person.getAdress());
            preparedStatement.setString(5,person.getCity());
            if (preparedStatement.executeUpdate()>0){
                System.out.println("Add success");
            }
        }
    }
    private static void delete(Integer integer) throws SQLException {
        try (Connection connection = DBConector.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("delete from person where id = "+integer))
        {
            preparedStatement.execute();
        }
    }
    private static void update(){


    }
}
