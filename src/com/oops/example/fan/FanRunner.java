package com.oops.example.fan;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("One",2.2222,"red");
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
        fan.switchOn();
        fan.setSpeed((byte) 3);
        System.out.println(fan);



    }
}
