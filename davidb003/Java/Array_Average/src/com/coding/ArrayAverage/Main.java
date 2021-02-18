package com.coding.ArrayAverage;

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

        sum = 0;
        for(int i = 0; i < arrayLenght ; i++) {
            if (array[i] > average) {
                sum = sum + array[i];
            }
        }

        System.out.println("Somma dei numeri maggiori: " + sum);
    }
}
