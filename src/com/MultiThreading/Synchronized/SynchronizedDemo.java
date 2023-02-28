package com.MultiThreading.Synchronized;
class count{
    int count1;
    public synchronized void count() {
        count1++;
    }
}
public class SynchronizedDemo {
    public static void main(String[] args) throws Exception{
    count c = new count();
    Thread t1 = new Thread(()->{
        for (int i = 0; i <1000;i++)
            c.count();
    });
    Thread t2 = new Thread(()->{
        for (int i = 0; i <1000;i++)
            c.count();
    });
    Thread t3 = new Thread(new Runnable(){
        public void run() {
            for(int i = 0; i < 1000;i++)
                c.count();
        }
    });
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    t3.start();
    t3.join();
    System.out.println(c.count1);
}
}
