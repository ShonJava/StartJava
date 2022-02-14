package com.startjava.lesson_2.wolf;

public class Wolf {
    String name;
    int age;
    String color;

    void walk() {
        System.out.println(color + " " + name + " walking");
    }
    void run() {
        System.out.println(color + " " + name + " running");
    }
    void sing() {
        System.out.println(color + " " + name + " singing, age is " + age);
    }
}