package com.Interfaces.Example.Game;

public class GameRunner {
    public static void main(String[] args) {
        GamingConsole game = new ChessGame();
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
