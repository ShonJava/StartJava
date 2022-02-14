package com.startjava.lesson_2.wolf;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setName("Kija");
        wolf.setAge(9);
        wolf.setColor("white");
        wolf.run();
        wolf.walk();
        wolf.sing();
    }
}
/*    Модифицируйте класс Wolf
        у всех полей класса напишите модификатор доступа private
а у его методов — public
для доступа к полям создайте геттеры и сеттеры
        в сеттере поля age реализуйте проверку: если возраст волка > 8 лет, то выведите сообщение "Некорректный возраст". В противном случае сохраните значение в поле
        Модифицируйте класс WolfTest
        с помощью сеттеров присвойте полям экземпляра класса Wolf какие-то значения
        считайте эти значения из полей с помощью геттеров и отобразите в консоли*/