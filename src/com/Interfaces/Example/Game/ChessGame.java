package com.Interfaces.Example.Game;

public class ChessGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("move front");
    }

    @Override
    public void down() {
        System.out.println("move back");
    }

    @Override
    public void left() {
        System.out.println("move left");
    }

    @Override
    public void right() {
        System.out.println("move right");
    }

}
