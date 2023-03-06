package com.DesignPatterns.FactoryDesignPattern.Example;

public class FactoryMain {
    public static void main(String[] args) {
        gettingVehicle get = new gettingVehicle();
        vehicle vehicle = get.getVehicle("car");
        vehicle.show();
    }
}
