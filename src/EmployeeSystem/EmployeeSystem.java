package EmployeeSystem;

import java.util.Scanner;

public class EmployeeSystem {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);

        Employee[] employees = {
                new FullTime(1001,"Trung","trung1234@gmail.com",20000000,500000),
                new Intern(2001,"Trân","tran456@gmail.com",4000000,"Tien"),
                new Contractor(3001,"Minh","minh@gmail.com",0,150,30000)
        };


        for (Employee employee : employees){
            System.out.println("Nhân viên: " + employee.getName());
            System.out.println("ID: " + employee.getID());
            System.out.println("Email: " + employee.getEmail());
            System.out.println("Type: " + employee.getType());
            System.out.println("Net Salary: " + employee.caculateSalary() + "\n");

            if (employee instanceof Contractor) {
                Contractor intern = (Contractor) employee;
                System.out.println("Working Hour: " + intern.getWorkingHours()); 
            }
        }
    }
}

