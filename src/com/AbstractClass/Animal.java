package com.AbstractClass;

 public abstract class Animal {
    abstract public void bark();
}

class dog extends Animal {
    public void bark() {
        System.out.println("bow bow");
    }
}
class AnimalRunner{
    public static void main(String[] args) {
        Animal ani = new dog();
        ani.bark();
    }
}