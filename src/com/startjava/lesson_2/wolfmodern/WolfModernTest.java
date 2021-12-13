package com.startjavalesson_2.wolf

public class WolfModernTest {
    public static void main(String[] args) {

        WolfModern wolf = new WolfModern();        
        wolf.setNickName("Carrot");
        System.out.println("Nick of wolf " + wolf.getNickName()); 
        wolf.setMale("Man");
        System.out.println("Male of wolf " + wolf.getMale());       
        wolf.setAge(8);        
        System.out.println("age wolf " + wolf.getAge());
        wolf.setWeight(26);
        System.out.println("Weight of wolf " + wolf.getWeight());        
        wolf.setColour("green");
        System.out.println("Color of wolf " + wolf.getColour());

    }
}