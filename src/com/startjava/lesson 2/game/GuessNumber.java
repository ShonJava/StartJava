package com.startjava.lesson 2.game;

import java.util.Random;

public class GuessNumber {
    Random random = new Random(100);
    int number = (int) (Math.random() * 101);

    private String playerOne;
    private Srting playerTwo;

    public Player(String playerOne, String playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
}

    public void screen() {
        System.out.println(number);
    }
}