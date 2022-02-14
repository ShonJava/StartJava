package com.startjava.lesson_1.cycle;

public class Cycle2 {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        System.out.println();


        for(int j = -6; j <= 6; j++) {
            System.out.println(j);
            j = j + 2;
        }
        System.out.println();

        int x = -6;
        while (x != 6) {
            System.out.println(x);
            x += 2;
        }
        System.out.println();

        int y = 10;
        int q = 0;
        int sum = 0;
        do {
            q = y % 2;
            if(q != 0) {
                sum += y;
                System.out.println(y + " - " + sum);
            }
            y++;
        } while (y <= 20);
        System.out.println("sum " + sum);


    }
}
