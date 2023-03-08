package com.DesignPatterns.AbstractFactory.Example;

public class EngineeringMainMethod {
    public static void main(String[] args) {


        course courses = new course();
        joincourse gonnajoin = courses.getcourse("arts");
        gonnajoin.getartscourse("english").join();

    }
}