package com.startjava.lesson_2_3_4.calculatorarr;

public class CalculatorArr {
    private int number1;
    private int number2;
    private char operator;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }
    public void  setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void calculateArr() {
        switch(operator) {
            case '+':
                System.out.println("Сумма чисел равна " + (number1 + number2));
                break;
            case '-':
                System.out.println("Разность чисел равен " + (number1 - number2));
                break;
            case '*':
                System.out.println("Произведение чисел равен " + (number1 * number2));
                break;
            case '/':
                System.out.println("Частное чисел равно " + (number1 / number2));
                break;
            case '%':
                System.out.println("Остаток от деления чисел равно " + Math.IEEEremainder(number1, number2));
                break;
            case '^':
                System.out.println("Степень числа равно " + Math.pow(number1, number2));
                break;
            default:
                System.out.println("Неверный оператор");
        }
    }
}
