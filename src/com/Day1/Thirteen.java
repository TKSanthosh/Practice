package com.Day1;

import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int student = sc.nextInt();
        int marks = sc.nextInt();
        int[][] subjectMarks = new int[student][marks];
        for(int i=0;i < student;i++){
            for(int j=0;j< marks;j++){
                subjectMarks[i][j] = sc.nextInt();
            }
        }
        int result =0;
        for(int i =0 ;i < student;i++){
            for(int j = 0 ;j < marks;j++){
                result= result + subjectMarks[i][j];
            }
            System.out.println(result);
            result = 0;
        }
    }
}
