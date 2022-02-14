package com.startjava.lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        char sign = '+';
        if(sign == '+') {
            System.out.println("result a + b = " + (a + b));
        } else if(sign == '-') {
            System.out.println("result a - b = " + (a - b));
        } else if(sign == '*') {
            System.out.println("result a * b = " + (a * b));
        } else if(sign == '/') {
            System.out.println("result a / b = " + (a / b));
        } else if(sign == '^') {
            int result = 1;
            for(int i = 1; i <= b; i++) {
                result *= a;
            }
            System.out.println(result);
        } else if(sign == '%') {
            System.out.println("result a % b = " + (a % b));
        }
    }
}
