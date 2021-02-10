package com.school_Coding_Arrays;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reqInput = new Scanner(System.in);

        Random rand = new Random();
        int upperbound = 25;
        int int_random = rand.nextInt(upperbound);
        System.out.println(upperbound);

        System.out.print("Enter no. of elements you want in array:");

        int NumElements;
        int ArrayLenght = 0;
        int sum = 0;
        NumElements = reqInput.nextInt();

        int array[] = new int[NumElements];


        for(int i = 0; i < NumElements; i++)
        {
            array[i] = int_random;
        }




        // sorting array
        Arrays.sort(array);

        // let us print all the elements available
        System.out.println("Array ridordinato con successo nella seguente posizione: ");
        for (Object number : array) {
            System.out.println(number);
        }

        // entering the value to be searched
        int searchVal = 22;

        int retVal = Arrays.binarySearch(array,searchVal);

        int finalVal;
        finalVal = retVal + 1;

        System.out.println(searchVal + " si trova nella posizione numero: " + finalVal);

    }
}
