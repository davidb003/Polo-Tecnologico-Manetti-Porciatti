package com.school_bevanda;

//DONE 1.aggiungi prezzo;
//DONE 2.incremento prezzo;
//DONE 3. stampa;
//DONE 4. gradoalcolico;
//DONE 5. fine

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bevanda Bevanda = new Bevanda();
        double total = 0;


        String[] Bevanda_Array = new String [12];
        Bevanda_Array[0] = "Grappa";
        Bevanda_Array[1] = "30C";
        Bevanda_Array[2] = "Alcolica";
        Bevanda_Array[3] = "30€";

        Bevanda_Array[4] = "Vodka";
        Bevanda_Array[5] = "40C";
        Bevanda_Array[6] = "Alcolica";
        Bevanda_Array[7] = "35€";

        Bevanda_Array[8] = "Succo";
        Bevanda_Array[9] = "N/A";
        Bevanda_Array[10] = "Non alcolico";
        Bevanda_Array[11] = "5€";

        double[] Bevanda_Prezzo = {30, 35, 5};

        for(int i=0; i<Bevanda_Array.length; i++){
            total = total + Bevanda_Prezzo[i];
        }




        Scanner scan = new Scanner(System.in);

        boolean execute = true;
        byte select;
        byte inputIncremento;

        // TODO realizzare un menu con le seguenti opzioni
        //1..stampa del prezzo medio delle bevande
        //2..inserito il nome bevanda da tastiera incrementare il prezzo del 10%
        //3.. stampa di tutte le bevande
        //4.. stampa delle bevande con gradoalcolico > di 8;
        //5.. fine

        while (execute) {
            System.out.println("\n-------------------------------\n");
            System.out.println("Scegli una opzione");
            System.out.println("1. Media del prezzo delle bevande" +
                    "\n2. Inserisci prezzo\n3. Incrementa prezzo del 10%" +
                    "\n4. Determina grado alcolico\n5. Stampa\n6. Esci");
            System.out.print("> ");
            select = scan.nextByte();

            switch (select) {
                case 1:
                    double media = total / Bevanda_Array.length;
                    System.out.format("The average is: ");
                    System.out.println(media);
                    break;
                case 2:
                    System.out.println("\nInserisci Prezzo: ");
                    Bevanda.aggiungiPrezzo(scan.nextFloat());
                    break;

                case 3:
                    Bevanda.modificaPrezzo();
                    System.out.println("Prezzo incrementato del 10%");
                    break;

                case 4:
                    Bevanda.gradoAlcolico();
                    break;
                case 5:
                    Bevanda.stampa();
                    break;
                case 6:
                    execute = !execute;
                    break;

                default:
                    throw new IllegalStateException("Il tasto selezionato non è valido: " + select);
            }
        }
    }
}
