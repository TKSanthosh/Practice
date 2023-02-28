package com.MultiThreading.Demo;
class hi extends Thread{
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
class hello extends Thread{
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
        hi.start();
        try {Thread.sleep(10);}catch (Exception e){}
        hello.start();
    }
}
