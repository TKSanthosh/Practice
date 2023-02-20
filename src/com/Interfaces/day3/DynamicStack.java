package com.Interfaces.day3;

public class DynamicStack implements StackInterface{
    @Override
    public void push() {
        System.out.println("Dynamic stack push method");
    }

    @Override
    public void pop() {
        System.out.println("Dynamic stack pop method");

    }
}
