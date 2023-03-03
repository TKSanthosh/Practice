package com.Collections.Generics;
import java.util.*;
class container<T extends Number>{
    T value;
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}
public class GenericsDemo {
    public static void main(String[] args) {
       container<Integer> hi = new container<Integer>(); 
    }
}
