package com.Collections.List.ArrayList;

import java.util.List;

public class NormalList {
    public static void main(String[] args) {
        List<String> words = List.of("dog","cat","cow");
        System.out.println(words.size());
        System.out.println(words.get(0));
        System.out.println(words.contains("dog"));
        System.out.println(words.contains("don"));
        System.out.println(words.isEmpty());
    }
}
