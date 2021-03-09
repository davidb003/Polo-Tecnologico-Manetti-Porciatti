package com.school_Coding_FlipADice;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number6 = 0;

        int croce = 0;
        int i = 0;
        int lanci = 20;

        int[] array = new int[20];

        for(i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(6);
        }


        for(i = 0; i < lanci; i++) {

            if (array[i] == 1) {
                System.out.println(array[i]);
                number1++;
            }
            if (array[i] == 2) {
                number2++;
            }
            if (array[i] == 3) {
                number3++;
            }
            if (array[i] == 6) {
                number6++;
            }
        }


        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number6);

    }
}
