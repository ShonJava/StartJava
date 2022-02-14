package com.startjava.lesson_2.calculator;

public class Calculator {
    private int firstNumber;
    private char sign;
    private int secondNumber;
    private int result;
    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSign(char sign) {
        this.sign = sign;
    }
    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
    public void calculate() {
        switch (sign) {
            case ('+'):
                result = firstNumber + secondNumber;
                System.out.println("Sum is " + result);
                break;
            case ('-'):
                result = firstNumber - secondNumber;
                System.out.println("Difference is " + result);
                break;
            case ('*'):
                result = firstNumber * secondNumber;
                System.out.println("Multiplication is" + result);
                break;
            case ('/'):
                result = firstNumber / secondNumber;
                System.out.println("Division is " + result);
                break;
            case ('%'):
                if (firstNumber % secondNumber == 0) {
                    System.out.println("Without remaider");
                } else {
                    System.out.println("Remaider of division is" + firstNumber % secondNumber);
                }
                break;
            case ('^'):
                int result = 1;
                for (int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
                System.out.println("The power of the number is" + result);
                break;
            default:
                System.out.println("Use + - * / % ^");
        }
    }
}
