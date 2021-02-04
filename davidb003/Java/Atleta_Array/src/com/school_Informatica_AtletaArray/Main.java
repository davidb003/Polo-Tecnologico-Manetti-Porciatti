//TODO Primo....creare tre vettori..nomeatleta,squadra,golfatti
// Fare inserimento di n elementi, la stampa di tutti, la stampa degli atleti che hanno
// fatto piu di 10 gol,stampa del numero degli atleti di una squadra inserita da tastiera

package com.school_Informatica_AtletaArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Athlete athlete = new Athlete();
        Scanner reqInput = new Scanner(System.in);

        byte i;
        byte arrayWidth;

        String setName_Main;
        String setTeam_Main;
        byte setGoals_Main = 0;


        System.out.println("Quanti atleti ci sono? > ");
        arrayWidth = reqInput.nextByte();

        Athlete array[] = new Athlete[arrayWidth];

        for (i = 0; i < arrayWidth; i++) {
            System.out.println("\n");
            array[i] = new Athlete();

            System.out.println("Inserisci il nome dell'atleta " + (i + 1) + " > ");
            setName_Main = reqInput.next();
            array[i].setName(setName_Main);

            System.out.println("Inserisci il team dell'atleta " + (i + 1) + " > ");
            setTeam_Main = reqInput.next();
            array[i].setTeam(setTeam_Main);

            System.out.println("Inserisci i goal dell'atleta " + (i + 1) + " > ");
            setGoals_Main = reqInput.nextByte();
            array[i].setGoals(setGoals_Main);

            System.out.println("\n");
        }

        boolean execute = true;
        byte select;

        while (execute) {
            System.out.println("Scegli un opzione");
            System.out.println("> ");
            select = reqInput.nextByte();

            switch (select) {
                case 1:
                    for (i = 0; i < arrayWidth; i++) {
                        if (array[i].getGoals() > 10) {
                            System.out.println("\n");
                            System.out.println("L'Atleta " + array[i].getName() + "ha segnato più di 10 goals");
                        }
                    }
                case 2:
                        String inputSearchTeam;

                        System.out.println("\n");
                        System.out.println("Cerca un team > ");
                        inputSearchTeam = reqInput.next();
                    for (i = 0; i < arrayWidth; i++) {
                        if (inputSearchTeam.equals(array[i].team)) {
                            System.out.println("\n");
                            System.out.println("Dettagli squadra " + array[i].team + "\n Giocatore: " + array[i].name +
                                    " Goals: " + array[i].goals);
                        }
                    }
            }
        }
    }
}
