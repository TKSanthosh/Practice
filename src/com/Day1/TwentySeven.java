package com.Day1;

public class TwentySeven {
public static void main(String[] args){
    int n = 14000;
    int result = ((n+(40*n/100))-1500);
    result = result +(12*result/100);
    System.out.println(result);
}
}
