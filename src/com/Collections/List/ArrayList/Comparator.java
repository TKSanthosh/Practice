package com.Collections.List.ArrayList;
import java.util.*;
public class Comparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(31);
        list.add(40);
        list.add(59);
        Collections.sort(list,(a,b)-> {return a>b?1:-1;});
        System.out.println(list);

    }
}
