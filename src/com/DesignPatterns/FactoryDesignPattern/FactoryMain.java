package com.DesignPatterns.FactoryDesignPattern;

public class FactoryMain {
    public static void main(String[] args){
        GettingOs os = new GettingOs();
        OS os1 = os.getInstance("open");
        os1.show();
    }
}
