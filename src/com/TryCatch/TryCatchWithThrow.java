package com.TryCatch;

public class TryCatchWithThrow {
    public static void main(String[] args) /*throws Exception*/ {
        int i,j,k=0;
        i = 8;j =1;
        //int [] arr = new int[4];
try {
    k = i / j;
    if(k < 10){
        throw new ArithmeticException();
    }
}
    catch(ArithmeticException e){
        System.out.println("value is less than 10");
    }




        System.out.println(k);
    }
}
