package com.school_Coding_FlipADice;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        int one = 0, two = 0, three = 0, six = 0;
        int i = 0;
        int lanci = 20;

        int[] array = new int[20];

        for (i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }


        for (i = 0; i < lanci; i++) {
            if (array[i] == 1) {
                one++;
            }
            if (array[i] == 2) {
                two++;
            }
            if (array[i] == 3) {
                three++;
            }
            if (array[i] == 6) {
                six++;
            }
        }

        System.out.println("\n");
        System.out.println(one);
        System.out.println("\n");
        System.out.println(two);
        System.out.println("\n");
        System.out.println(three);
        System.out.println("\n");
        System.out.println(six);
    }
}
