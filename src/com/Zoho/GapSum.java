package com.Zoho;

public class GapSum {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int gap = 3;
        for(int i=0;i<gap;i++){
            int sum =0;
            for(int j=i;j<arr.length;j=j+gap){
                sum = sum+ arr[j];

            }
            System.out.println(sum);
        }
    }
}
