package com.Inheritance.Person;

public class Employee extends Person {
    private String title;
    private char employeeGrade;
    private int salary;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public char getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(char employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String tostring(){
        return super.toString() + "   "+ title +" "+ employeeGrade;
    }

}
