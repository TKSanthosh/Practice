package com.ObjectComposition;

public class Address {
    String doorNo;
    String streetName;
    String city;
    public Address(String DoorNo, String StreetName, String city){
        this.doorNo = DoorNo;
        this.streetName = StreetName;
        this.city = city;
    }
    public String toString(){
        return String.format("doorno - %s,streetName - %s,city - %s",doorNo,streetName,city);
    }
}
