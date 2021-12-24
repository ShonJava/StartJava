package com.startjava.lesson_4.calculator;

class Calculator {
    private int number1;
    private int number2;
    private char operator;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void calculate() {
        switch(operator) {
            case '+':
                System.out.println("sum is " + (number1 + number2));
                break;
            case '-':
                System.out.println("defference is " + (number1 - number2));
                break;
            case '*':
                System.out.println("multiplication is " + (number1 * number2));
                break;
            case '/':
                System.out.println("division is " + (number1 / number2));
                break;
            case '%':
                System.out.println("remainder is " + Math.IEEEremainder(number1, number2));
                break;
            case '^':
                System.out.println("math pow is " + Math.pow(number1, number2));
                break;
            default:
                System.out.println("error");
        }
    }
}
