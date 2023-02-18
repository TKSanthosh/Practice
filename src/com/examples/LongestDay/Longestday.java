package com.examples.LongestDay;
import java.lang.*;
public class Longestday {
    public static void main(String[] args){
        String[] days ={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        longest longg = new longest();
        int arr[] = longg.longday(days);
        System.out.println(arr[0] + " "+days[arr[1]]);
        reverse rev = new reverse();
        String[] reversedorder =  rev.rev(days);
        for(String i: reversedorder){
            System.out.println(i);
        }
    }
}
class longest{
    int[] longday(String[] s){
        int max = s[0].length();
        int day = 0;
        for(int i=1;i<s.length;i++){
            if(s[i].length() > max){
                max = s[i].length();
                day = i;
            }
        }
        int arr[] = {max,day};
        return arr;
    }
        }
class reverse{
    String[] rev(String[] day) {
        int n = day.length;
        String[] rev = new String[n];
        int k = 0;
        for (int i = rev.length - 1; i > -1; i--) {
            rev[k] = day[i];
            k++;
        }
        return rev;
    }
}