package com.DesignPatterns.BuilderPattern;

public class Textile {
    public static void main(String[] args) {
        Towel tow = new TowelBuilder().setLength(10).setName("tk").setPrice(100).gettowel();
        System.out.println(tow);
    }
}
class Towel{
    private String name;
    private int length;
    private int price;
    Towel(String name,int length,int price){
        this.length=length;
        this.name= name;
        this.price=price;
    }
    public String toString(){
        return "name-"+name+ " price-"+price+" length-"+length;
    }
}
class TowelBuilder{
    private String name;
    private int length;
    private int price;
    public TowelBuilder setName(String name){
        this.name=name;
        return this;
    }
    public TowelBuilder setPrice(int price){
        this.price = price;
        return this;
    }
    public TowelBuilder setLength(int length){
        this.length = length;
        return this;
    }
    public Towel gettowel(){
        return new Towel(name,price,length);
    }
}