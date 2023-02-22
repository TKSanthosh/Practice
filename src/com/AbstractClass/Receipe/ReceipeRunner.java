package com.AbstractClass.Receipe;

public class ReceipeRunner {
    public static void main(String[] args) {
        Receipe receipe = new Receipe();
        //receipe.execute();

        ReceipeWithMicroOven receipe2 = new ReceipeWithMicroOven();
        receipe2.execute();
    }
}
