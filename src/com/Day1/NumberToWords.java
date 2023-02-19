package com.Day1;

import java.util.Scanner;

public class NumberToWords {
    static String word = "";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        int length = number.length();
        int [] arr = new int[length];
        for(int i=0;i<number.length();i++) {
            arr[i] = (int)(number.charAt(i) - '0');
        }
        if (length == 3) {
            System.out.println(words(arr[0]) + " hundred and " +(
                    arr[1] ==0 ? words(arr[2]):
                    (arr[1] > 1 & arr[2] == 0)?tens(arr[1]):
                    (arr[1] > 1)?
                            (tens(arr[1]) +" "+words(arr[2])):
                            teens(arr[1],arr[2])));
        }
        if(length ==2 ){
            System.out.println(arr[1] ==0?tens(arr[0]):
                    arr[0]>1?tens(arr[0])+" "+words(arr[1]):
                    teens(arr[0],arr[1]));
        }
        if(length ==1 ){
            System.out.println(words(arr[0]));
        }
    }

    static String words(int n) {
        switch (n) {
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
            case 6:
                word = "six";
                break;
            case 7:
                word = "seven";
                break;
            case 8:
                word = "eight";
                break;
            case 9:
                word = "nine";
                break;
            default:
                word = "ten";
        }
        return word;
    }

    static String tens(int n) {

        switch (n) {
            case 1:
                word = "ten";
                break;
            case 2:
                word = "twenty";
                break;
            case 3:
                word = "thirty";
                break;
            case 4:
                word = "fourty";
                break;
            case 5:
                word = "fifty";
                break;
            case 6:
                word = "sixty";
                break;
            case 7:
                word = "seventy";
                break;
            case 8:
                word = "eighty";
                break;
            default:
                word = "ninty";
                break;

        }
        return word;
    }
    static String teens(int a,int b){
        int n = a*10+b;
        switch (n) {
            case 11:
                word = "eleven";
                break;
            case 12:
                word = "twelve";
                break;
            case 13:
                word = "thirteen";
                break;
            case 14:
                word = "fourteen";
                break;
            case 15:
                word = "fifteen";
                break;
            case 16:
                word = "sixteen";
                break;
            case 17:
                word = "seventeen";
                break;
            case 18:
                word = "eighteen";
                break;
            default:
                word = "ninteen";
                break;

        }
        return word;

    }
}