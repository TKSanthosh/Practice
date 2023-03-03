package com.Collections.Set;
import java.util.*;
import java.util.stream.Stream;

public class set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("2");
        set.add("4");
        set.add("3");
        set.add("1");


        //set.get(1);
        Iterator <String> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());

        }
        Stream<String> stream = set.stream();
        stream.forEach(element -> System.out.println(element));

        Set<String> set2 = new HashSet<String>();
        set2.addAll(set);
        System.out.println(set2);
        set2.removeAll(set2);
        System.out.println(set2);
    List<String> list = new ArrayList<String>();
    list.addAll(set);
        System.out.println(list);


        SortedSet sortedSet = new TreeSet();

        sortedSet.add("a");
        sortedSet.add("b");
        sortedSet.add("c");
        sortedSet.add("d");
        sortedSet.add("e");

        SortedSet headSet = sortedSet.headSet("c");
        System.out.println(headSet);
    }

}
