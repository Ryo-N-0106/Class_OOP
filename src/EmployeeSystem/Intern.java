package EmployeeSystem;

public class Intern extends Employee{
    public String mentorName;

    public Intern(int ID, String name, String email, double basicSalary, String mentorName) {
        super(ID, name, email, basicSalary);
        this.mentorName = mentorName;
    }

    @Override
    public double caculateSalary() {
        return getBasicSalary();
    }

    @Override
    public String getType() {
        return "Intern";
    }
}
