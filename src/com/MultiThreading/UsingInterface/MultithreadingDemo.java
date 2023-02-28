package com.MultiThreading.UsingInterface;
class hi implements Runnable{
    public void run() {
        for (int i = 0;i<5;i++){
            System.out.println("hi");
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e){}
        }
    }
}
class hello implements Runnable{
    public void run() {
        for (int i = 0;i<5;i++){
            System.out.println("hello");
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e){}
        }
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        hi hi = new hi();
        hello hello = new hello();
        Thread t1 = new Thread(hi);
        Thread t2 = new Thread(hello);
        t1.start();
        try {Thread.sleep(10);}catch (Exception e){}
        t2.start();
    }
}
