package com.DesignPatterns.FactoryDesignPattern.Example;

public class FactoryMain {
    public static void main(String[] args) {
//         get = new gettingVehicle();
        vehicle vehicle = gettingVehicle.getVehicle("car");
        vehicle.show();
    }
}
