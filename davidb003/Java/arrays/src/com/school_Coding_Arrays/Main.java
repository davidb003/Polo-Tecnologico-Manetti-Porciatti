package com.school_Coding_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reqInput = new Scanner(System.in);

        Object[] array = {10,2,22,69};

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