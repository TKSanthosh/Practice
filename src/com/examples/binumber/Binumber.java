package com.examples.binumber;

public class Binumber {
    private int a,b;
    Binumber(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int add(){
        return a + b;
    }
    public int multiply(){
        return a * b;
    }
    public void Double(){
        a= a * 2 ;
        b= b * 2;
    }
    public int getnumber1(){
        return a;
    }
    public int getnumber2(){
        return b;
    }
}
