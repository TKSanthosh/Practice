package com.MultiThreading.ExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executerservice {
    public static void main(String[] args) {
        printoddeven print = new printoddeven();
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(() ->{
            synchronized (print){
                print.printodd(100);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }

        });
        es.execute(() ->{
            synchronized (print){
                print.printeven(100);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }


        });
        
    }


}
class printoddeven{
    public void printodd(int n){
        for(int i=1;i<=n;i=i+2)
            System.out.println(i);

    }
    public void printeven(int n){
        for(int i=2;i<=n;i=i+2){
            System.out.println(i);
        }
    }
}