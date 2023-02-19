package com.Day1;

public class PrimeBtwn1to100 {
    public static void main(String[] args){
        int count =0;
        for(int i=2;i<=100;i++){
            for(int j=2;j<=100;j++){
             if(i%j==0){
                count++;
             }
        }
            if(count==1){
                System.out.println(i);

            }
            count=0;
        }
    }
}
