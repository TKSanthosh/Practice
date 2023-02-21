package com.Inheritance.Person;

public class Employee extends Person {
    private String title;
    private char employeeGrade;
    private int salary;
    Employee(String name,String title){
        super(name);
        this.title = title;
    }

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


    public String toString(){
        return super.toString() + "   "+ title +" "+ employeeGrade;
    }

}
