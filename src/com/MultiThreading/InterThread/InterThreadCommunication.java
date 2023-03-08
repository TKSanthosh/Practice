package com.MultiThreading.InterThread;

class Q {
    int num;
    boolean valueset = false;

    public synchronized void put(int num) {
        this.num = num;
        while (valueset) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("put" + num);
        valueset = true;
        notify();
    }
    public synchronized void get() {
        while (!valueset) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        System.out.println("get" + num);
        valueset = false;
        notify();
    }
}

class Producer implements Runnable {
    Q q;

    public Producer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    public void run() {
        for (int i = 1; ; i++) {
            q.put(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class customer implements Runnable {
    Q q;

    public customer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "consumer");
        t.start();
    }

    public void run() {
        for (int i = 1; ; i++) {
            q.get();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new customer(q);
    }
}