package EmployeeSystem;

public class FullTime extends Employee{
    private double bonus;

    public FullTime(int ID, String name, String email, double basicSalary, double bonus) {
        super(ID, name, email, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double caculateSalary() {
        return getBasicSalary() + bonus;
    }

    @Override
    public String getType(){
        return "Full-time";
    }
}
