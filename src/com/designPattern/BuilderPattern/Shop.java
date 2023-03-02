package com.designPattern.BuilderPattern;

public class Shop {
    public static void main(String[] args) {
        Phone p = new Phone("android","Mediatek",2,6,4000);
        System.out.println(p);
        Phone p1 = new PhoneBuilder().setOs("ios").setBattery(4000).getPhone();
        System.out.println(p1);
    }
}
