package com.startjava.lesson_2.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer;

        do {
            System.out.println("Введите первое число");
            calculator.setFirstNumber(scanner.nextInt());
            System.out.println("Введите знак математической операции");
            calculator.setSign(scanner.next().charAt(0));
            System.out.println("Введите второе число");
            calculator.setSecondNumber(scanner.nextInt());
            calculator.calculate();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = scanner.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}
