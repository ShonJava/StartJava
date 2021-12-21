package com.startjava.lesson_2_3.game;

import java.util.Random;
import java.util.Scanner;

class GuessNumber {
    private Player pl1;
    private Player pl2;

    public GuessNumber(Player pl1, Player pl2) {
        this.pl1 = pl1;
        this.pl2 = pl2;
    }

    public void start() {
        Random rnd = new Random();
        int secretNum = rnd.nextInt(100 + 1);
        Scanner console = new Scanner(System.in);

        while (true) {
            System.out.println(pl1.getName() + " Enter the your number");
            int num = console.nextInt();
            if (num == secretNum) {
                System.out.println("The winner is " + pl1.getName());
                break;
            } else if (num > secretNum) {
                System.out.println("Your number biggest than");
            } else {
                System.out.println("Your number lower than");
            }

            System.out.println(pl2.getName() + " Enter the your number");
            num = console.nextInt();
            if (num == secretNum) {
                System.out.println("The winner is " + pl2.getName());
                break;
            } else if (num > secretNum) {
                System.out.println("Your number biggest than");
            } else {
                System.out.println("Your number lower than");
            }
        }
    }
}
