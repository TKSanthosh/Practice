package com.examples.TaxiBooking;
import java.util.*;
public class Booking {
    public static void bookTaxi(int id,char pickupPoint,char dropPoint,int pickupTime,List<Taxi>freeTaxi){
        int min = 999;
       // int distancebetweenPickupAndDrop = 0;
        int earning = 0;
        int nextfreetime =0;
        char nextSpot = 'Z';
        Taxi bookedTaxi = null;
        String tripDetail = "";
        for(Taxi t : freeTaxi){
            int distancebetweenPickupAndDrop = Math.abs((t.currentspot - '0')-(pickupPoint-'0') )*15;
            
        }



    }
    public static List<Taxi> getFreeTaxi(List<Taxi>taxi,char pickupPoint,int pickupTime){
        for(Taxi t : taxi){
            if(t.freetime <= pickupTime && (Math.abs((t.currentspot-'0') - (pickupPoint-'0'))<= pickupTime - t.freetime)){
                taxi.add(t);
            }
        }
        return taxi;
    }
    public static List<Taxi> createTaxis(int n){
        List<Taxi> taxi = new ArrayList<Taxi>();
        for(int i=1;i<=n;i++){
            Taxi t = new Taxi();
            taxi.add(t);
        }
        return taxi;
    }
    public static void main(String[] args) {
        List<Taxi> taxis = createTaxis(4);
        Scanner sc = new Scanner(System.in);
        int id = 1;
        while(true){
            System.out.println("0 for booking");
            System.out.println("1 for taxi details");
            int choice = sc.nextInt();

        switch (choice){
            case 0:
                int customerid = id;
                System.out.println("enter the pickupPoint");
                char pickupPoint = sc.next().charAt(0);
                System.out.println("enter the DropPoint");
                char dropPoint = sc.next().charAt(0);
                System.out.println("enter the pickup time");
                int pickupTime = sc.nextInt();
                if(pickupPoint < 'A' || pickupPoint > 'F' || dropPoint < 'A' || dropPoint > 'F'){
                    System.out.println("A B C D E F points only there so enter correctly...");
                    return;
                }
                List<Taxi> freeTaxi = getFreeTaxi(taxis,pickupPoint,pickupTime);

                if(freeTaxi.size()==0){
                    System.out.println("No taxi is available right now");
                }
                int temp;
                for(int i=0;i<freeTaxi.size();i++){
                    for(int j=i+1;j<freeTaxi.size();j++){
                            if(freeTaxi.get(i).earning > freeTaxi.get(j).earning){
                                temp = freeTaxi.get(i).earning;
                                freeTaxi.get(i).earning = freeTaxi.get(j).earning;
                                freeTaxi.get(j).earning = temp;
                            }
                    }
                }
                bookTaxi(id,pickupPoint,dropPoint,pickupTime,freeTaxi);
                id++;




                break;

            case 1:
                break;
        }
    }
}}