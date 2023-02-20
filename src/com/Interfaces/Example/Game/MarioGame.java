package com.Interfaces.Example.Game;

public class MarioGame implements GamingConsole {


    @Override
    public void up() {
        System.out.println("jump");
    }

    @Override
    public void down() {
        System.out.println("sit");

    }

    @Override
    public void left() {
        System.out.println("move backward");

    }

    @Override
    public void right() {
        System.out.println("move front");

    }
}
