package com.LambdaExpression;
@FunctionalInterface
interface A{
    public int add();
}
public class LambdaDemo {

    public static void main(String[] args) {
//        A a = new A(){
//            public int add(){
//                return 2+3;
//            }
//        };
//        System.out.println(a.add());
        A a = () -> {
                return 2+3;
            };
        System.out.println(a.add());
    }
}
