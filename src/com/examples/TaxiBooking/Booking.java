package com.examples.TaxiBooking;
import java.util.*;
public class Booking {
    public static void main(String[] args) {
        ArrayList<Taxi> taxis = new ArrayList<Taxi>();
        int n = 4;
        int id = 1;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            Taxi t = new Taxi(id++);
            taxis.add(t);
        }
        while (true) {
            System.out.println("0 for booking");
            System.out.println("1 to exit");
            int m = sc.nextInt();
            switch (m) {
                case 0:
                    String name = sc.next();
                    char pickup = sc.next().charAt(0);
                    char drop = sc.next().charAt(0);
                    int price = book(pickup, drop);
                    System.out.println(name + ": " + price);
                    break;
                case 1:
                    System.out.println("Thank you");
            }
        }
    }

    public static int book(char pickup, char drop) {
        int price = 0;

        if (pickup >= 'A' || pickup <= 'D' || drop >= 'A' || drop <= 'D') {
            price = Math.abs((int)(pickup - drop)) * 10;

        }
        return price;
    }
}