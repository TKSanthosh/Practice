package com.Collections.List.ArrayList;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(0,0);
        System.out.println(myList);
        List<Integer> urlist = new ArrayList<Integer>();
        urlist.add(4);
        urlist.addAll(myList);
        System.out.println(urlist);
        System.out.println(myList.indexOf(3));
        System.out.println(myList.contains(3));
    myList.add(null);
        System.out.println(myList.contains(null));
        System.out.println(urlist);
        myList.retainAll(urlist);
        System.out.println(myList);
        List<String> list      = new ArrayList<>();

        list.add("element 1");
        list.add("element 2");
        list.add("element 3");
        list.add("element 4");

        List<String> sublist = list.subList(1, 3);
        System.out.println(sublist);
    String arr[];
    arr = list.toArray(new String[0]);
    for (int i = 0; i < arr.length; i++)
        System.out.println(arr[i]);


    }
}
