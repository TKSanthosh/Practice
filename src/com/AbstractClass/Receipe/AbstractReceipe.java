package com.AbstractClass.Receipe;

public abstract class AbstractReceipe {
    public void execute(){
        prepare();
        receipe();
        cleanup();
    }
    abstract void prepare();
    abstract void receipe();
    abstract void cleanup();

}
