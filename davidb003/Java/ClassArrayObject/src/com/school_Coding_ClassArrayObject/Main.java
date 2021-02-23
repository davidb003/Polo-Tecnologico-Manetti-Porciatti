package com.school_Coding_ClassArrayObject;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int arrayLenght;
        int i;

        Scanner reqInput = new Scanner(System.in);

        System.out.println("Quanti studenti ci sono? >");
        arrayLenght = reqInput.nextInt();

        String[] studenti = new String[arrayLenght];

        for (i = 0; i < arrayLenght; i++) {
            studenti[i] = reqInput.next();
        }

        // Aggiungi Studenti
        System.out.println("Cerca uno studente >");
        String searchedInput;
        searchedInput = reqInput.next();
        boolean found = Arrays.stream(studenti).anyMatch(searchedInput::equals);
        if(found){
            for (i = 0; i < arrayLenght; i++) {
                studenti[i] = reqInput.next();
            }
        }

    }
}