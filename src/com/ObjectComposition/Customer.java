package com.ObjectComposition;

public class Customer {
    private String name;
    private Address homeAddress;
    private Address workAddress;

    Customer(String name,Address homeAddress){
        this.name = name;
        this.homeAddress = homeAddress;
    }
    public void SetHomeAddress(Address homeAddress){
        this.homeAddress = homeAddress;
    }
    public Address getHomeAddress(){
        return homeAddress;
    }
    public void SetWorkAddress(Address workAddress){
        this.workAddress = workAddress;
    }
    public Address getWorkAddress(){
        return workAddress;
    }
    public String toString(){
        return String.format("name - %s , HomeAddress : %s,WorkAddress - %s ",name,homeAddress,workAddress) ;
    }

}
