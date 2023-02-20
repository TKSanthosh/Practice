package com.Day1;

public class TwentyFour {
    public static void main(String[] args){
        Quadratic equation = new Quadratic();
        Quadratic equation2 = new Quadratic(1,2,3);
        System.out.println(equation.compute(2));
        System.out.println(equation2.compute(3));
        System.out.println(equation2.AExtractor());
        System.out.println(equation2.BExtractor());
        System.out.println(equation2.CExtractor());

        //,equation2.BExtractor(),equation2.CExtractor());
    }
}
class Quadratic{
    private int a,b,c;
    Quadratic(){
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }
    Quadratic(int x,int y,int z){
        a = x;
        b = y;
        c = z;
    }
    public void modifier(int a,int b,int c){
        this.a =a;
        this.b =b;
        this.c =c;
    }
    public int AExtractor(){
        return a;
    }
    public int BExtractor(){
        return b;
    }
    public int CExtractor(){
        return c;
    }
    public int compute(int x){
        return a*x*x+b*x+c;
    }

}
