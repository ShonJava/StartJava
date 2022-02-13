package com.startjava.lesson_1.cycle;

public class Cycle {
    public static void main(String[] args) {
        //Перевод псевдокода на язык Java
        int age = 20;
        if(age > 20) {
            System.out.println("age biggest than " + age);
        } else  {
            System.out.println("age lower than " + age);
        }
        boolean male = false;
        if(!male) {
            System.out.println("it's man");
        }
        float height = 1.80f;
        if(height < 1.80f) {
            System.out.println("height lower than " + 1.80f);
        } else {
            System.out.println("height biggest than " + 1.80f);
        }
        char firstLetOfName;
        firstLetOfName = "Max".charAt(0);
        if(firstLetOfName == 'M') {
            System.out.println("first let name is M");
        } else if(firstLetOfName == 'I') {
            System.out.println("first let name is I");
        } else {
            System.out.println("error");
        }
        System.out.println();

        //Поиск максимального и минимального числа
        int first = 1;
        int second = 2;
        if(first > second) {
            System.out.println(first + " big than " + second);
        }
        else {
            System.out.println(second + " big than " + first);
        }
        System.out.println();

        //Работа с числом
        int anyNum = 23;
        if(anyNum == 0) {
            System.out.println(anyNum + " is 0");
        } else if(anyNum < 0) {
            System.out.println(anyNum + " negative number");
        } else if(anyNum % 2 == 0) {
            System.out.println(anyNum + " is gues number");
        } else {
            System.out.println(anyNum + " not gues number");
        }
        System.out.println();

        //Поиск общей цифры в числах
        int x = 234;
        int y = 152;
        int i = 0;
        int j = 0;
        String strx = Integer.toString(x);
        String stry = Integer.toString(y);
        System.out.println("first number " + strx);
        System.out.println("second number " + stry);
        for(i = 0; i < 3; i++) {
            char x1 = strx.charAt(i);
            for(j = 0; j < 3; j++) {
                char y1 = stry.charAt(j);
                if(x1 == y1) {
                    System.out.println("result " + x1 + " and " + y1);
                }
            }
        }
        System.out.println();

        //Определение буквы или символа по их коду
        char sign = '\u005A';
        System.out.println(sign);
        int signNum = (int) (sign);
        System.out.println(signNum);
        if(signNum < 64) {
            System.out.println("symbol");
        } else if(signNum > 90) {
            System.out.println("symbol");
        } else {
            System.out.println(sign + " have dec " + signNum + " is Let");
        }
        System.out.println();

        //Определение суммы вклада и начисленных банком %
        float balance = 300000f;
        float sumBalance = 0;
        System.out.println("balance is " + balance);
        if(balance < 100000) {
            sumBalance = balance * 0.05f;
            System.out.println("5% = " + sumBalance);
        } else if(balance > 100000 && balance < 300000) {
            sumBalance = balance * 0.05f;
            System.out.println("7% = " + sumBalance);
        }else {
            sumBalance = balance * 0.10f;
            System.out.println("10% = " + sumBalance);
        }
        System.out.println();

        //Определение оценки по предметам
        int history = 59;
        int program = 51;
        int h = 0;
        int p = 0;
        if(history > 60 && history < 73) {
            System.out.println("history 3" + history + "%");
            h = 3;
        } else if(history > 73 && history < 91) {
            System.out.println("history 4" + history + "%");
            h = 4;
        } else if(history > 91) {
            System.out.println("history 5" + history + "%");
            h = 5;
        } else {
            System.out.println("scores lower than 60%");
            h = 2;
        }
        if(program > 60 && program < 73) {
            System.out.println("program 3" + program + "%");
            p = 3;
        } else if(program > 73 && program < 91) {
            System.out.println("program 4" + program + "%");
            p = 4;
        } else if(program > 91) {
            System.out.println("program 5" + program + "%");
            p = 5;
        } else {
            System.out.println("scores lower than 60%");
            p = 2;
        }
        int medium = (h + p) / 2;
        int percent = (history + program) / 2;
        System.out.println("medium score " + medium);
        System.out.println("medium percernt " + percent);
        System.out.println();

        //Расчет прибыли (убытка)
        int rent = 5000;
        int profit = 15000;
        int costPrice = 9000;
        int revenue = 0;
        revenue = profit - costPrice - rent;
        int yearRevenue = revenue * 12;
        if(yearRevenue > 0) {
            System.out.println("revenue year is " + yearRevenue);
        } else {
            System.out.println("have not revenue");
        }
        System.out.println();

        //Определение существования треугольника
        float a = 5f;
        float b = 5f;
        float c = 9f;
        float square = (a * b) / 2;
        float c2 = c * c;
        float ab = (a * a) + (b * b);
        if(c2 == ab) {
            System.out.println("triangle is try, it's square is " + square);
        } else {
            System.out.println("triangle in not try");
        }
        System.out.println();

        //Подсчет количества банкнот

    }
}
