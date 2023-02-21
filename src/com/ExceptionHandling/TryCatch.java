package com.ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
       method1();
        System.out.println("main method ended");
    }
    public static void method1(){
        method2();
        System.out.println("method1 ended");
    }
    public static void method2(){
        try {
            String str = null;
            int a = str.length();
            System.out.print("method2 ended");
        }catch (Exception ex){
            ex.printStackTrace();
        }
}
}