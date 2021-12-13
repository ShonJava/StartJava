package com.startjava.lesson_2.wolf;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.male = "Man";
        wolf.nickName = "Cucumber";
        wolf.weight = 30;
        wolf.color = "Grey";

        System.out.println("Name of wolf " + wolf.nickName);
        System.out.println("Color of wolf " + wolf.color);
        System.out.print("Wolf is ");
        wolf.run();
        System.out.print("Wolf is ");
        wolf.walk();
    }
}