package com.FileHandling;
import java.io.*;
public class RenameFile {
    public static void main(String[] args)throws Exception {
        File oldName = new File("hello.txt");
        File newName = new File("renamed.txt");
        if(oldName.renameTo(newName)){
            System.out.println("name changed successfully");
        }
        else{
            System.out.println("File name hasn't changed");
        }
    }
}
