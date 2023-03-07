package com.DesignPatterns.AbstractFactory;

public class AbstractFactoryMainMethod {
    public static void main(String[] args) {
        FactoryPattern fac = new FactoryPattern();
        getshapeandcolor get = fac.getshapeorcolor("shape");
        get.getshape("rectangle").draw();

        fac.getshapeorcolor("color").getcolor("red").fill();

    }



}
