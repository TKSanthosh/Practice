package com.Day1;
import java.util.*;
public class Twevle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int coloumns = scan.nextInt();
        int [][] givenArray = new int[rows][coloumns];
        for(int rowIndex = 0;rowIndex < rows; rowIndex++) {
            for(int coloumnIndex = 0;coloumnIndex < coloumns;coloumnIndex++) {
                givenArray[rowIndex][coloumnIndex] = scan.nextInt();
            }
        }
        int k= 0;
        for(int rowIndex =0;rowIndex < rows; rowIndex++) {
            for(int coloumnIndex = 0;coloumnIndex <= rowIndex;coloumnIndex++) {
                System.out.print(givenArray[rowIndex][coloumnIndex]+" ");
            }
            System.out.println();

        }
        scan.close();
    }

}
