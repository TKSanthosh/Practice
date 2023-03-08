package com.DesignPatterns.Singleton;
public class SingleTonClass{
    public static void main(String[] args) {
        singletonclassInstance obj1 = singletonclassInstance.getInstance("hello");

    }
}
class singletonclassInstance {
    private static volatile singletonclassInstance instance;
    private String data;

    private singletonclassInstance(String data) {
        this.data = data;
    }

    public static singletonclassInstance getInstance(String data) {
        singletonclassInstance result = instance;
        if (instance == null){                  //double checking
            synchronized (singletonclassInstance.class) {
                if (instance == null) {
                    instance = new singletonclassInstance(data);
                }

            }
    }
        return result;
}
}