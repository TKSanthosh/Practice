package com.FileHandling;
import java.io.*;
import java.util.*;
public class PropertyFiles {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
//        OutputStream os = new FileOutputStream("dataConfig.properties");
//        p.setProperty("url","localhost:3306/myDb");
//        p.setProperty("uname","santhosh");
//        p.setProperty("pass","1234");
//        p.store(os,null);

        InputStream is = new FileInputStream("dataConfig.properties");
        p.load(is);
        System.out.println(p.getProperty("uname"));
        p.list(System.out);

    }
}
