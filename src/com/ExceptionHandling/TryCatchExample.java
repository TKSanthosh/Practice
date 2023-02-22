package com.ExceptionHandling;

public class TryCatchExample {
    public static void main(String[] args) {
        int a = 5,b = 2;
        int c =0;
        try{
            c = a/b;
            int arr[] = null;
            System.out.println(arr[1]);

        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic error");
        }
        catch(NullPointerException e){
            System.out.println("Null pointer error");
        }
        catch(Exception e){
            System.out.println("error occured");
        }
        finally{
            System.out.println("whatever the exception this finally block gets executed");
        }
    }
}
