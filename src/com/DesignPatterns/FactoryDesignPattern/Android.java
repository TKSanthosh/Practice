package com.DesignPatterns.FactoryDesignPattern;

class Android implements OS {

    @Override
    public void show() {
        System.out.println("Best os for low budget");
    }
}
class Ios implements OS{
    public void show() {
        System.out.println("Flagship os ");
    }
}
class Windows implements OS{
    public void show(){
        System.out.println("worst os");
    }
}