package com.Inheritance.Person;

public class Person {
    private String name;
    private int phoneNumber;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return String.format("name - %s, phone - %d,email - %s",name,phoneNumber,emailAddress);
    }
}
