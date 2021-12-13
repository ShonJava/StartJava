package com.startjava.lesson 2.person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Name of person " + person.name);
        System.out.println("Male of person " + person.male);
        System.out.println("Height of peroson " + person.height);
        System.out.println("Age of person " + person.age);
        System.out.print("Person have ");
        person.run();
        System.out.print(person.learn());
    }
}