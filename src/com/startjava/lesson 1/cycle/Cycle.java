package com.startjava.lesson 1.cycle;

public class Cycle {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++)
            System.out.println(i);

        int j = 6;
        while(j >= -6) {            
            System.out.println(j);
            j -= 2;
        }

        int a = 10;
        int sumOdd = 0;
        do {
            if(a % 2 != 0) {            
                sumOdd += a;            
            }
            a++;       
        } while(a <= 20);  
        System.out.println("sum isEvenNumber 10...20 = " + sumOdd);
    }
}