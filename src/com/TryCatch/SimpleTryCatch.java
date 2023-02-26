package com.TryCatch;

public class SimpleTryCatch {
    public static void main(String[] args) {
        int i,j,k=0;
        i = 2;j =0;
        int [] arr = new int[4];
        try{
            //k = i/j;
            for(int c=0;c<=4;c++){
                arr[c] = c+1;
            }
            for(int x : arr){
                System.out.println(x);
            }
        }
        catch(ArithmeticException e){
            System.err.println("can't divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array size is 4 but u have enter more values than that");
        }
        System.out.println(k);
    }
}
