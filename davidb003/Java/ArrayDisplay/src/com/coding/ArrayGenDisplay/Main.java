package com.coding.ArrayGenDisplay;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int arrayLenght;
        int sum = 0;
        int i;

        Random rand = new Random();

        arrayLenght = 10;

        int[] array = new int[10];

        System.out.println("\nI " + arrayLenght + " numeri generati casualmente sono: ");
        for(i = 0; i < arrayLenght ; i++)
        {
            array[i] = rand.nextInt(arrayLenght);
            System.out.println(array[i]);
            sum = sum + array[i];

        }

        int[] highestNumbers = new int[10];

        int max = array[0];
        for(i = 0; i < arrayLenght; i++)
        {
            if(max < array[i])
            {
                max = array[i];
            }
        }

        highestNumbers[1] = max;
        System.out.println("\nIl numero piú alto é: " + highestNumbers[1]);
    }
}
