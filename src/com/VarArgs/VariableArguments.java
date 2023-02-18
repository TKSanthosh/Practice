package com.VarArgs;

public class VariableArguments {
    public static void main(String args[]){
        System.out.println(sum(1,2,3,4,5));
        System.out.println(String.join(",","6","7"));
        System.out.println(sum(1,2,3));
    }
    static int sum(int... value){
        int sums =0;
        for(int i: value){
            sums+=i;
        }
        return sums;
    }
}