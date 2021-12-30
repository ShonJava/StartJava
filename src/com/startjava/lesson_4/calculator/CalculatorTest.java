package com.startjava.lesson_4.calculator;

import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] arg) {
        Calculator calculator = new Calculator();
        Scanner console = new Scanner(System.in);
        String answer;
        do {
            calculator.calculate();
            do {
                System.out.println("Do you want to be continue? [yes/no]");
                answer = console.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}
