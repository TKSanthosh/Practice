package com.oops.example.motorbike;

public class MotorBikeNames {
    public static void main(String[] args){
        MotorBike hero = new MotorBike(100);
        System.out.println(hero.getSpeed());
        MotorBike pulsar = new MotorBike();
        System.out.println(pulsar.getSpeed());
        //hero.putSpeed(30);
        hero.increaseSpeed(100);
        System.out.println(hero.getSpeed());
        hero.decreaseSpeed(20);
        System.out.println(hero.getSpeed());


    }
}
