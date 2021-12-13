package com.startjava.lesson 2.wolfmodern;

public class WolfModern {
    private String male;
    private String nickName;
    private int age;
    private int weight;
    private String colour;

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }  

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 8) {
            System.out.println("Age not correct");
        } else {
            this.age = age;   
        }     
    }
    
    public void run() {
        System.out.println("running");
    }

    public void sit() {
        System.out.println("sitting");
    }

    public void walk() {
        System.out.println("walking");
    }

    public void sing() {
        System.out.println("singing");
    }

    public void hunt() {
        System.out.println("hunting");
    }
}