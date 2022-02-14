package com.startjava.lesson_2.wolf;

public class Wolf {
    private String name;
    private int age;
    private String color;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age > 8) {
            System.out.println("error");
        } else {
            this.age = age;
        }
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println(color + " " + name + " walking");
    }
    public void run() {
        System.out.println(color + " " + name + " running");
    }
    public void sing() {
        System.out.println(color + " " + name + " singing, age is " + age);
    }
}