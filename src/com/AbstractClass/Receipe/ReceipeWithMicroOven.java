package com.AbstractClass.Receipe;

public class ReceipeWithMicroOven extends AbstractReceipe{
    public void receipe(){
        System.out.println("take the sauce and pour on it");
        System.out.println("After mixing it well put it into the microoven");
    }
    public void prepare(){
        System.out.println("first cut all the things needed for the receipe");
    }
    public void cleanup(){
        System.out.println("after doing all the things cleanup the place where u have cooked");
        System.out.println("don't forget to off the microoven");
    }

}
