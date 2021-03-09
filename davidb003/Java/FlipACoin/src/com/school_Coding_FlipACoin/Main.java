package com.school_Coding_FlipACoin;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        int testa = 0;
        int croce = 0;
        int i = 0;
        int lanci = 10;

        int[] array = new int[10];

        for(i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(2);
        }
        for(i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        for(i = 0; i < lanci; i++) {
            if (array[i] >= 1) {
                croce++;
            }
            else {
                testa++;
            }
        }

        System.out.println(testa);
        System.out.println(croce);


        }
}
