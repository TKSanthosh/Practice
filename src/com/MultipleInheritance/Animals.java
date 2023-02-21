package com.MultipleInheritance;

public class Animals {
}
class pet extends Animals {
    public void groom(){
        System.out.println("groom");
    }
}
class dog extends pet{

}
class Animal{
    public static void main(String[] args) {
        pet dogs = new dog();
        dogs.groom();

    }


}