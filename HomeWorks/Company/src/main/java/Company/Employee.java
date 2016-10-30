package Company;

public class Employee {
    private String name;
    private String surname;
    private int salary;
    private int IdEmployee;
    private static int IdCount = 0;

    public Employee() {
        this.name = "";
        this.surname = "";
        this.IdEmployee = ++IdCount;
    }

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.IdEmployee = ++IdCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIdEmloyee() {
        return IdEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        IdEmployee = idEmployee;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
