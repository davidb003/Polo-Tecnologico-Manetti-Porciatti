package com.school_Coding_ClassArrayObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int arrayLenght;
        int i;
        String searchedInput;

        Scanner reqInput = new Scanner(System.in);

        System.out.println("Quanti studenti ci sono? >");
        arrayLenght = reqInput.nextInt();

        String[] studenti = new String[arrayLenght];

        for (i = 0; i < arrayLenght; i++) {
            System.out.println("\nInserisci lo studente " + i + " >");
            studenti[i] = reqInput.next();
        }


        boolean execute = true;
        byte select;

        while (execute) {
            System.out.println("Scegli un opzione\n");
            System.out.println("1. Aggiungi Studente\n" +
                    "2. Rimuovi Studente\n" +
                    "3. Stampa gli studenti in ordine alfabetico\n" +
                    "4. Esci\n");
            System.out.println("> ");
            select = reqInput.nextByte();

            switch (select) {
                case 1:
                    // Aggiungi Studenti
                    System.out.println("Aggiungi uno studente >");
                    searchedInput = reqInput.next();
                    boolean foundAdd = Arrays.stream(studenti).anyMatch(searchedInput::equals);
                    if (foundAdd) {
                        for (i = 0; i < arrayLenght; i++) {
                            studenti[i] = reqInput.next();
                        }
                    }
                    break;
                case 2:
                    // Rimuovi Studenti
                    System.out.println("Cerca uno studente >");
                    searchedInput = null;
                    searchedInput = reqInput.next();
                    List<String> list = new ArrayList<String>(Arrays.asList(studenti));
                    list.remove(searchedInput);
                    break;
                case 3:
                    // Print array studenti in ordine alfabetico
                    Arrays.sort(studenti);
                    System.out.println(Arrays.toString(studenti));
                    break;
                case 4:
                    execute = !execute;
                    break;
                default:
                    throw new IllegalStateException("Il tasto selezionato non esiste");
            }
        }
    }
}