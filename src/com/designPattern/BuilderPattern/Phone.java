package com.designPattern.BuilderPattern;

public class Phone {
    private String os;
    private String processor;
    private int ram;
    private int screen;
    private int battery;

    Phone(String os, String processor, int ram, int screen, int battery){
        this.os = os;
        this.processor = processor;
        this.ram = ram;
        this.screen = screen;
        this.battery = battery;
    }
    public String toString() {
        return "os:"+ os + " " + "processor:"+ processor + " "+"ram: "+ram+ " " + "screen:" +screen + "battery: "+" " + battery;
    }

}
