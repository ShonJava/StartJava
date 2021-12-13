package com.startjava.lesson_2.jaeger;

public class Jaeger {
    private String name;
    private int mark;
    private String origin;
    private float height;
    private float weight;
    private int kaijuKilled;

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    int getKaijuKilled() {
        return kaijuKilled;
    }

    public void setKaijuKilled(int kaijuKilled) {
        this.kaijuKilled = kaijuKilled;
    }

    public void move() {
        System.out.println(name + " wins " + kaijuKilled + " kaijus");
        System.out.println("Height " + height + " weight " + weight);
        System.out.println("origin " + origin + " mark " + mark);        
    }

    public void run() {
        System.out.println("jaeger " + name + " running");
    }

    public boolean drift() {
        System.out.println(name + " drifting");
        return true;
    }

}