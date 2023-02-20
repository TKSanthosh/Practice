package com.Interfaces.day3;

public class FixedStack implements StackInterface {

    @Override
    public void push() {
        System.out.println("Fixed Stack push method");
    }

    @Override
    public void pop() {
        System.out.println("Fixed Stack pop method");

    }
}
