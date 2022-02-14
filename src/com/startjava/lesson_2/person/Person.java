package com.startjava.lesson_2.person;

public class Person {
        String name = "Max";
        int age = 30;
        char male = 'M';

        void move() {
            System.out.println(name + " moving");
        }
        void eat() {
            System.out.println(name + " eating");
        }
        String speak() {
            System.out.println("speaking" + " ");
            return "hello";
        }
}
