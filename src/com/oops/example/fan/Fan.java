package com.oops.example.fan;

public class Fan {
    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte speed;

    Fan(String make, double radius, String color){
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    public void switchOn() {
        isOn = true;
        setSpeed((byte) 1);
    }
    public void switchOff() {
        isOn = false;
        setSpeed((byte)0);
    }
    public void setSpeed(byte speed) {
        this.speed = speed;
    }

    public String toString(){
        return String.format("make %s,radius - %f,color - %s ,isOn %b ,speed %d",make,radius,color,isOn,speed);
    }
}
