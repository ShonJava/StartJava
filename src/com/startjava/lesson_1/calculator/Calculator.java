package com.startjava.lesson_1.calculator;

class Calculator {
    public static void main(String[] args) {
        System.out.println(calculate(10, 5,'^'));
    }

    public static int calculate(int firstNumber, int secondNumber, char symbol) {
        int result = 0;
        if (symbol == '+') {
            result = firstNumber + secondNumber;
        } else if (symbol == '-') {
            result = firstNumber - secondNumber;
        } else if (symbol == '*') {
            result = firstNumber * secondNumber;
        } else if (symbol == '/') {
            result = firstNumber / secondNumber;
        } else if (symbol == '^') { 
            result = 1;           
            while (secondNumber > 1) {                
                result *= firstNumber;
                secondNumber--; 
            }
        } else if (symbol == '%') {
            result = firstNumber % secondNumber;
        }
        return result;
    }
}