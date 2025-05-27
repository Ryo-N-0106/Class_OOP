package EmployeeSystem;

public class Contractor extends Employee{
    public int workingHours;
    private double hourlyRate;

    public Contractor(int ID, String name, String email, double basicSalary, int workingHours, double hourlyRate) {
        super(ID, name, email, basicSalary);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    @Override
    public double caculateSalary() {
        return workingHours * hourlyRate;
    }

    @Override
    public String getType() {
        return "Contractor";
    }
}
