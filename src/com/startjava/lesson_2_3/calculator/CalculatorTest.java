package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String otvet;

        do {
            System.out.println("Enter the first number");
            calculator.setFirstNumber(console.nextInt());
            System.out.println("Enter the second number");
            calculator.setSecondNumber(console.nextInt());
            calculator.operate();
            do {
                System.out.println("do you want to be continue? [yes/no]");
                otvet = console.nextLine();
            } while(!otvet.equals("yes") && !otvet.equals("no"));
        } while (otvet.equals("yes"));
    }
}
