package com.school_Coding_Arrays;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reqInput = new Scanner(System.in);
        Random rand = new Random();

        int lenght = 0;
        System.out.println("Quanti numeri vuoi inserire? >");
        lenght = reqInput.nextInt();
        System.out.println("Inserisci la dimensione massima dei numeri generati >");
        int maxNum;
        maxNum = reqInput.nextInt();
        int[] array = new int [lenght];

        int randNum;
        int i = 0;
        for (Object number : array) {
            randNum = rand.nextInt(maxNum);
            System.out.println(randNum);
            array[i] = randNum;
        }

        Arrays.sort(array);
        System.out.println("Riordiamento array:");
        for (Object number : array) {
            System.out.println(number);
        }

        int searchVal;
        System.out.println("Cerca nell'array: ");
        searchVal = reqInput.nextInt();


        int retVal = Arrays.binarySearch(array,searchVal);

        int finalRetVal;
        finalRetVal = retVal + 1;
        System.out.println("L'elemento " + searchVal + " si trova nella posizione " + finalRetVal);
    }
}