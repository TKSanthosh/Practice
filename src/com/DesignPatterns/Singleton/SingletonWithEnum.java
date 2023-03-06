package com.DesignPatterns.Singleton;

public class SingletonWithEnum {
    public static void main(String[] args) {
        ABC a = ABC.INSTANCE;
        a.i=10;
        a.show();
        ABC b = ABC.INSTANCE;
        b.i=19;
        a.show();

    }
}
enum ABC{
    INSTANCE;
    int i;
    public void show(){
        System.out.println(i);
    }
}