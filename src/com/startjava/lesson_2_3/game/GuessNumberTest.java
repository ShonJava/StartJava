package com.startjava.lesson_2_3.game;

import java.util.Scanner;

class GuessNumberTest {
    public static void main(String[] arg) {
        Scanner console =new Scanner(System.in);
        System.out.println("Enter the name of first player");
        String name1 = console.nextLine();
        Player player1 = new Player(name1);
        System.out.println("Enter the name of second player");
        String name2 = console.nextLine();
        Player player2 = new Player(name2);

        GuessNumber game = new GuessNumber(player1, player2);
        String answer;

        do {
            game.start();
            do{
                System.out.println("Do you want to begin");
                answer = console.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));

    }
}
