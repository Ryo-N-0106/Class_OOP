package EmployeeSystem;

public abstract class Employee {
    private int ID;
    private String name;
    private String email;
    private double basicSalary;

    public abstract double caculateSalary();

    public Employee(int ID, String name, String email, double basicSalary) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.basicSalary = basicSalary;
    }

    public String getType(){
        return "General Employee";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
}
