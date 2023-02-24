package com.Inheritance.CostOfHouse;

public class HouseRunner {
    
}
class House{
    private int DoorCost = 120;
    private int WindowsCost = 200;
    public int costofdoor(int door){
        return door * this.DoorCost;
    }
    public int costofwindow(int window){
        return window * this.WindowsCost;
    }
}
class Door extends House{

}
class window extends House{

}