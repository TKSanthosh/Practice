package com.Interfaces.day3;

public class StackExample {
    public static void main(String[] args) {
        StackInterface stack1 = new FixedStack();
        stack1.push();
        stack1.pop();
        StackInterface stack2 = new DynamicStack();
        stack2.push();
        stack2.pop();

    }
}
