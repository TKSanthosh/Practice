package com.ExceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
       method1();
    }
    public static void method1(){
        method2();
    }
    public static void method2(){
    String str = null;
    int a =str.length();
        System.out.print("method2 ended");
}
}