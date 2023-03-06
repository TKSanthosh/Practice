package com.DesignPatterns.FactoryDesignPattern;

public class GettingOs {
    public static OS getInstance(String s){
        if(s.equals("open")){
            return new Android();
        }
        else if(s.equals("costly")){
            return new Ios();
        }
        else {
            return new Windows();
        }
    }
}
