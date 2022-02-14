package com.startjava.lesson_2.wolf;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.name = "Kija";
        wolf.age = 3;
        wolf.color = "white";
        wolf.run();
        wolf.walk();
        wolf.sing();
    }
}