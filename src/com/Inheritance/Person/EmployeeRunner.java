package com.Inheritance.Person;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("master");
        employee.setTitle("software dev");
        employee.setEmailAddress("tksanthosh49@gmail.com");
        employee.setEmployeeGrade('A');
        System.out.println(employee.tostring());
    }
}
