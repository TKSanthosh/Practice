package com.Collections.Map;

import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("name","santhosh");
        map.put("initial", "TK");
        map.put("age","21");

        Set<String>k = map.keySet();
        for(String i : k){
            System.out.println(i+ "   "+map.get(i));
        }
        Set<Map.Entry<String,String>> value= map.entrySet();
        for(Map.Entry<String,String> j :value){
            System.out.println(j.getKey()+" "+j.getValue());
        }


        System.out.println(map);




    }
}
