package com.FileHandling;

import java.io.File;

public class ListAllFiles {
    public static void main(String[] args) {

        File f = new File("D:\\UdemyIn28Minutes");
        String[] path = f.list();
        for (String paths : path) {
            System.out.println(paths);
        }
    }
}
