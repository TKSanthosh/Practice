package com.Collections.List.ArrayList.Example;
import java.util.*;
public class CarRunnerUsingLambda {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<Car>();
        list.add(new Car("vivo","tn1234",4));
        list.add(new Car("oppo","ad3456",6));
        list.add(new Car("realme","kr0987",5));
        Collections.sort(list, (Car1,Car2) -> Car1.name.compareTo(Car2.name));
        System.out.println(list);

        Iterator<Car> iterator = list.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}
