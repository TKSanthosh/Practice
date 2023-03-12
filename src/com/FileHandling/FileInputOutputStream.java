package com.FileHandling;

import java.io.*;
public class FileInputOutputStream {
public static void main(String[] args) throws Exception {
  File f = new File("demo.txt");
  FileOutputStream fos = new FileOutputStream(f);
  DataOutputStream dos = new DataOutputStream(fos);
  dos.writeUTF("hello world");

  FileInputStream fis = new FileInputStream(f);
  DataInputStream dis = new DataInputStream(fis);
  String str = dis.readUTF();
  System.out.println(str);



}
}
