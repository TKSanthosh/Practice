package com.DesignPatterns.AbstractFactory.Example;

public interface engineering {
    public void join();
}
interface arts {
    public void join();
}
class ece implements engineering{
    public void join(){
        System.out.println("joined ece");
    }
}
class cse implements engineering{
    public void join(){
        System.out.println("joined cse");
    }
}
class it implements engineering{
    public void join(){
        System.out.println("joined it");
    }
}
class english implements arts{
    @Override
    public void join() {
        System.out.println("joined ba.english");
    }
}
class tamil implements arts{
    @Override
    public void join() {
        System.out.println("joined ba.tamil");
    }
}
class maths implements arts{
    @Override
    public void join() {
        System.out.println("joined ba.maths");
    }
}
abstract class joincourse{
    abstract engineering getengineeringcourse(String s);
    abstract arts getartscourse(String s);
}
class getengineering extends joincourse{

    @Override
    engineering getengineeringcourse(String s) {
        if(s.equals("ece") )
            return new ece();
        else if(s.equals("cse") )
            return new cse();
        else if(s.equals("it") )
            return new it();
        return null;
    }

    @Override
    arts getartscourse(String s) {
        return null;
    }
}
class getarts extends joincourse{

    @Override
    engineering getengineeringcourse(String s) {
        return null;
    }

    @Override
    arts getartscourse(String s) {
        if(s.equals("english") )
            return new english();
        else if(s.equals("tamil") )
            return new tamil();
        else if(s.equals("maths") )
            return new maths();
        return null;
    }
}
class course {
    joincourse getcourse(String s){
        if (s.equals("engineering"))
            return new getengineering();
        if(s.equals("arts"))
            return new getarts();
        return null;
    }
}