package com.Day1;
import java.util.*;
public class NumberToWords2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0;i<number.length();i++){
            System.out.print(words[(int)(number.charAt(i) -'0')]+" ");
        }

    }
}
