package com.school_Coding_ClassArrayObject;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    byte arrayLenght = 0;
	    int i = 0;

        Scanner reqInput = new Scanner(System.in);
        Students students = new Students();
        Random rand = new Random();

        System.out.println("Quanti studenti ci sono in classe? > ");
        arrayLenght = reqInput.nextByte();

        Class studentsArrayObj[]= new Class[arrayLenght];


        // TODO Questo programma è lo sbocco
        int studentAdd;
        for(i = 0; i < arrayLenght ; i++)
        {
            studentAdd =
            System.out.println(array[i]);
            sum = sum + array[i];

        }


    }
}
