package com.startjava.lesson_2_3_4.calculatorarr;

import java.util.Scanner;

public class CalculatorArrTest {
    public static void main(String[] arg) {
        CalculatorArr calculatorArr = new CalculatorArr();
        Scanner console = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Введите математическое выражение");
            String words = console.nextLine();
            String[] elements = words.split(" ");
            calculatorArr.setNumber1(Integer.parseInt(elements[0]));
            calculatorArr.setOperator(elements[1].charAt(0));
            calculatorArr.setNumber2(Integer.parseInt(elements[2]));
            calculatorArr.calculateArr();
            do{
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answer = console.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));

    }
}
