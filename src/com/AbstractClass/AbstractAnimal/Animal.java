package com.AbstractClass.AbstractAnimal;

public abstract class Animal {
    abstract void sound();
}
class dog extends Animal {
    void sound() {
        System.out.println("bow bow");
    }
}
class cat extends Animal {
    void sound() {
        System.out.println("meow meow");
    }
}
class AnimalRunner{
    public static void main(String[] args) {
        Animal[] ani = {new dog(), new cat()};
        for(Animal i : ani){
            i.sound();
        }
    }
}