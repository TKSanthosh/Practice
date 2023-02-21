package com.ObjectComposition;

public class CustomerRunner {
    public static void main(String[] args) {
        Address Homeaddress = new Address("14","kathirvel nagar","villapuram");
        Customer customer = new Customer("Santhosh",Homeaddress);
        Address Workaddress = new Address("14","kathirvel","villapuram");
        customer.SetWorkAddress(Workaddress);

        System.out.println(customer);


    }
}
