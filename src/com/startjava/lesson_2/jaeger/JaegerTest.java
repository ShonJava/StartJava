package com.startjava.lesson_2.jaeger;

import java.util.Scanner;

import java.util.Scanner;
public class JaegerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя робота, количество оружия, побед");
        Jaeger jaeger = new Jaeger(scanner.nextLine(), scanner.nextInt(), scanner.nextInt());
        jaeger.war();
    }
}
