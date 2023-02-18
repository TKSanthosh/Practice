package com.WrapperClass;
import java.lang.*;
public class Wrapper {
    public static void main(String[] args){
         Integer i = new Integer(7);
         Integer j = Integer.valueOf(7);
         Integer k = 7; //autoboxing ... it will create the function of Integer.valueOf() itself ...it will be as Integer k = Integer.valueOf(7)
         System.out.println(j == k); //it compares the value of both the variable
        System.out.println(i == k); // it compare the memory location of the both the variable i.e i is object and k is variable
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

    }
}
