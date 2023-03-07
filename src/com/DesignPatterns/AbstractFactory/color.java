package com.DesignPatterns.AbstractFactory;

interface color
{
    public void fill();
}
interface shape{
    public void draw();
}
class rectangle implements shape{
    public void draw(){
        System.out.println("Rectangle");
    }
}
class circle implements shape{
    public void draw(){
        System.out.println("circle");
    }
}
class triangle implements shape{
    public void draw(){
        System.out.println("triangle");
    }
}
class red implements color{

    @Override
    public void fill() {
        System.out.println("Red");
    }
}
class green implements color{

    @Override
    public void fill() {
        System.out.println("green");
    }
}
class blue implements color{

    @Override
    public void fill() {
        System.out.println("blue");
    }
}

abstract class getshapeandcolor{
    abstract shape getshape(String s);
    abstract color getcolor(String s);
}
class getshape extends getshapeandcolor{

    @Override
    public shape getshape(String s) {
        if(s.equals("rectangle")) {
            return new rectangle();
        }
        else if (s.equals("circle")) {
            return new circle();
        }
        else if (s.equals("triangle")) {
            return new triangle();
        }
        else{
            return null;
        }
    }

    @Override
    public color getcolor(String s) {
        return null;
    }
}
class getcolor extends getshapeandcolor{

    @Override
    shape getshape(String s) {
        return null;
    }

    @Override
    color getcolor(String s) {
        if(s.equals("red")) {
            return new red();
        }
        else if (s.equals("blue")) {
            return new blue();
        }
        else if (s.equals("green")) {
            return new green();
        }
        else{
            return null;
        }
    }
}
class FactoryPattern{
    public getshapeandcolor getshapeorcolor(String s){
        if(s.equals("shape")){
            return new getshape();
        } else if (s.equals("color")) {
            return new getcolor();
        }
        else
            return null;
    }
}