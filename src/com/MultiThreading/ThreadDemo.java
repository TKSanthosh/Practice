package com.MultiThreading;
class hi{
    void run() {
        for(int i=0;i<5;i++){
            System.out.println("hi");
            try{Thread.sleep(500);} catch(Exception e){}
        }
    }
}
class hello{
    void run(){
        for(int i=0;i<5;i++){
            System.out.println("hello");
            try{Thread.sleep(500);} catch(Exception e){}
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        hi hi = new hi();
        hello hello = new hello();
        hi.run();
        hello.run();

    }
}
