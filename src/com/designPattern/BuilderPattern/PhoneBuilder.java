package com.designPattern.BuilderPattern;

public class PhoneBuilder {
    private String os;
    private String processor;
    private int ram;
    private int screen;
    private int battery;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setScreen(int screen) {
        this.screen = screen;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }
    public Phone getPhone() {
        return new Phone(os,processor,ram,screen,battery);
    }
}
