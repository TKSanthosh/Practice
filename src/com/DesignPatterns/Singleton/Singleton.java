package com.DesignPatterns.Singleton;

public class Singleton {
    public static void main(String[] args) {
        abc obj = abc.getInstance();
        //System.out.println();

    }
}
class abc{
    private static abc instance;
    private int a;
    private abc(int a){
        this.a = a;
    }
    public static abc getInstance(){
        if(instance == null){
            instance = new abc(10);
        }
        return instance;
    }
}