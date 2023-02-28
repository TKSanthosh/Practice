package com.examples.TaxiBooking;

import java.util.*;

public class Taxi {
    static int count = 0;
    int id;
    boolean booked;
    char currentspot;
    int earning;
    int freetime;
    List<String> trips;

    public Taxi() {
        booked = false;
        currentspot = 'A';
        earning = 0;
        freetime = 6;
        trips = new ArrayList<String>();
        count++;
        id = count;

    }
    public void setDetails(boolean booked, char currentspot,int earning, int freetime,String tripsDetail){
        this.booked = booked;
        this.currentspot = currentspot;
        this.earning = earning;
        this.freetime = freetime;
        this.trips.add(tripsDetail);
    }
    public void printDetails(){
        System.out.println("Taxi"+ this.id + "earning"+ this.earning);
        System.out.println("TaxiId  BookingID    CustomerId    From  To    PickUpTime    DropTime  Amount");
        for(String trip:trips){
            System.out.println(id+"     "+trip    );
        }
        System.out.println("--------------------------------------------------------------------------------");
    }
    public void printTaxiDetails(){
        System.out.println("taxi "+this.id+" earning "+this.earning+"currentspot"+this.currentspot+"freetime"+this.freetime);
    }
}