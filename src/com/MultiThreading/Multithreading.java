package com.MultiThreading;

public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        Book book = new Book();
        update updates = new update();
        book.start();
        updates.start();
        if(book.isAlive()){
            System.out.println("Book is alive");
        }
        book.join();
        updates.join();
        if(book.isAlive()){
            System.out.println("hi");
        }
        System.out.println("Bye");
    }
}
class Book extends Thread{
    public void run(){
        for (int i = 0; i <5;i++){
            System.out.println("hello");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class update extends Thread{
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