package com.oops.example.Rectangle;

public class Rectangle {
    private int length;
    private int breadth;
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public void setLength(int l){
        length =l;
    }
    public void setBreadth(int b){
        breadth = b;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public int Area(){
        return length * breadth;
    }
    public int perimeter(){
        return  2*(length + breadth);

    }
    public String toString(){

        return String.format("length - %d, breadth - %d",length,breadth);
    }
}
