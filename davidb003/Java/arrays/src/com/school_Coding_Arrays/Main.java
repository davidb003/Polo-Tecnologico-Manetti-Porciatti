package com.school_Coding_Arrays;
import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        test Test = new test();

        int[] array;

        Random rand = new Random();
        int outputRand = rand.nextInt(5);
        for (int i = 0; i < args.length; i++) {
            array[i] = outputRand;
        }

        Arrays.sort(array);

        System.out.println(array + " found at index = " + Arrays.binarySearch(array,5));

    }
}
