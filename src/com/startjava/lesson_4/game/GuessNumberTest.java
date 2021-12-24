package com.startjava.lesson_4.game;

import java.util.Scanner;

class GuessNumberTest {
    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);
        System.out.println("Yor have 10 attempts");

        System.out.println("Enter the name of first player");
        Player playerOne = new Player(console.next());

        System.out.println("Enter the name of second player");
        Player playerTwo = new Player(console.next());

        GuessNumber guessNumber = new GuessNumber(playerOne, playerOne);
        String answer;
        do {
            guessNumber.startGame();
            do {
                System.out.println("Do you want to continue the game? [yes/no]");
                answer = console.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}
