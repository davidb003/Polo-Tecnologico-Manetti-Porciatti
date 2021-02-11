package com.coding.ArrayAverage_If;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int arrayLenght;
        int sum = 0;
        float average;

        Random rand = new Random();
        Scanner reqInput = new Scanner(System.in);

        System.out.print("Quanti numeri vuoi generare? > ");
        arrayLenght = reqInput.nextInt();

        int[] array = new int[arrayLenght];


        System.out.println("\nI " + arrayLenght + " numeri generati casualmente sono: ");
        for(int i = 0; i < arrayLenght ; i++)
        {
            array[i] = rand.nextInt(arrayLenght);
            System.out.println(array[i]);
            sum = sum + array[i];
        }
        System.out.println("\n");
        System.out.println("Somma: " + sum);
        average = sum / arrayLenght;
        System.out.println("Media: " + average);

        int search;
        System.out.println("Inserisci un numero dal quale fare la somma");
        search = reqInput.nextInt();

        sum = 0;
        for(int i = 0; i < arrayLenght ; i++) {
            if (array[i] > search) {
                sum = sum + array[i];
            }
        }

        System.out.println("Somma dei numeri maggiori di " + search + ": " + sum);

        int max = array[0];

        for(int i = 1; i < arrayLenght ; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        System.out.println("max = " + max);


        int min = array[0];

        for(int i = 1; i < arrayLenght ; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        System.out.println("min = " + min);

    }
}
