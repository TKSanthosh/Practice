package com.MultiThreading.UsingLambdaExpression;
public class MultithreadingDemo {
    public static void main(String[] args) {
//        Runnable obj1 = new Runnable() {
//            @Override
//            public void run() {
//                for(int i = 0; i < 5; i++) {
//                    System.out.println("hi");
//                    try{Thread.sleep(500);}catch(Exception e){}
//                }
//            }
//        };
//        Runnable obj2 = ()-> {
//            for(int i = 0; i < 5;i++){
//                System.out.println("hello");
//                try{Thread.sleep(500);}catch(Exception e){}
//            }
//        };
        Thread t1 = new Thread (()->{
             {
                for(int i = 0; i < 5; i++) {
                    System.out.println("hi");
                    try{Thread.sleep(500);}catch(Exception e){}
                }
            }
        },"hi thread" + Thread.currentThread().getPriority());

        try{Thread.sleep(50);}catch(Exception e){}
        Thread t2 = new Thread(()->{
            for(int i = 0; i < 5; i++) {
                System.out.println("hello");
                try{Thread.sleep(500);}catch(Exception e){}
            }
        },"Hello thread" + Thread.currentThread().getPriority());
        t1.start();
        System.out.println(t1.getName());
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getName());
        System.out.println(t1.isAlive());
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (Exception e){}
        System.out.println(t1.isAlive());
        System.out.println("Bye");
    }
}