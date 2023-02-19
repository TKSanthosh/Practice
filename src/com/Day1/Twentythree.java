package com.Day1;

class FirstClass {

      protected int n = 12;

}
class SecondClass{
    FirstClass number = new FirstClass();
    int manipulateData(){
        number.n = 33;
        return number.n;
    }

}
class main{
    public static void main(String[] args){
        SecondClass number = new SecondClass() ;
        System.out.println(number.manipulateData());
    }
}
