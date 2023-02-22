package com.Interfaces.Flyable;

interface FlyableRunner {
    void fly();
}
class bird implements FlyableRunner{
    public void fly(){
        System.out.println("with wings");
    }
}
class aero implements FlyableRunner{
    public void fly(){
        System.out.println("with fuel");
    }
}
class flyable {
    public static void main(String[] args) {
        FlyableRunner [] fly = {new bird(),new aero()};
        for(FlyableRunner i : fly){
            i.fly();
        }
    }
}