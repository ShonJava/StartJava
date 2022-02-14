package com.startjava.lesson_2.jaeger;

public class Jaeger {
    String name;
    int weapons;
    int win;
    public Jaeger(String name, int weapons, int win) {
        this.name = name;
        this.weapons = weapons;
        this.win = win;
    }
    public void war() {
        System.out.println("Jaeger " + name + " have a " + weapons + " weapons, " + "win " + win + " kaiju");
    }
}
