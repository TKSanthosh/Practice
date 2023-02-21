package com.Inheritance.Person;

public class Student extends Person{
    private String college;
    Student(String name){
        super(name);

    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private int year;



}
