package com.oops.example.Rectangle;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10,12);
        rect.setBreadth(25);
        rect.setLength(20);
        System.out.println(rect);
        System.out.println(rect.Area());
        System.out.println(rect.perimeter());


    }
}
