package com.DesignPatterns.FactoryDesignPattern.Example;

public interface vehicle {
    void show();
}
class car implements vehicle{
    public void show(){
        System.out.println("I have four wheels");
    }
}
class bike implements vehicle{
    @Override
    public void show() {
        System.out.println("i have 2 wheels");
    }
}

class gettingVehicle{
    public vehicle getVehicle(String s){
        if(s.equals("bike")){
            return new bike();
        }
        else{
            return new car();
        }
    }
}