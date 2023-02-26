package com.MultiThreading2;

public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        Runnable book = () ->{

                for (int i = 0; i <5;i++){
                    System.out.println("hello");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);

                }
            }
        };
        update updates = new update();
        Thread t1 = new Thread(book);
        Thread t2 = new Thread(updates);
        t1.run();
        t2.run();
        System.out.println("Bye");
    }
}

class update implements Runnable{
    public void run()  {
        for (int i = 0; i < 5;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}