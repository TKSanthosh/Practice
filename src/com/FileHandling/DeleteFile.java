package com.FileHandling;
import java.util.*;
import java.io.*;



public class DeleteFile {

    public static void deletefile(String str){
        File f = new File(str);
        if(f.exists()){
            if(f.delete()){
                System.out.println("file deleted");
            }
            else{
                System.out.println("file doesn't deleted");
            }
        }
        else{
            System.out.println("file doesnt existed");
        }


    }
    public static void main(String[] args) {
        System.out.println("Enter the file name");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        deletefile(str);

    }
}
