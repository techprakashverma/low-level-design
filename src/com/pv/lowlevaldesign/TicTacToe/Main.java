package com.pv.lowlevaldesign.TicTacToe;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Game game = new Game();
        game.initializeGame();
        System.out.println("game winner is: " + game.startGame());
    }
}
