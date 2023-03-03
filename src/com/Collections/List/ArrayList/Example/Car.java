package com.Collections.List.ArrayList.Example;

public class Car {
    public String name;
    private String plateNo;
    private int doorNo;
    Car(String name,String plateNo,int doorNo){
        this.name = name;
        this.plateNo = plateNo;
        this.doorNo = doorNo;
    }
    public String toString() {
        return name + plateNo + doorNo;
    }
}
