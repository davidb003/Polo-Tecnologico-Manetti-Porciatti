package com.school_disco;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        float newPrezzo;

        Disco disco = new Disco();
        Scanner scanner = new Scanner(System.in);
        byte select = 0;
        boolean execute = true;

        while (execute) {
            System.out.println("==========Main Menu==========\n" +
                    "1) Output" +
                    "\n2) Aggiungi Prezzo" +
                    "\n3) Aggiungi Canzoni" +
                    "\n4) Chiudi");
            System.out.println("> ");
            select = scanner.nextByte();

            switch (select) {
                case 1:
                    disco.print();
                    break;

                case 2:
                    System.out.println("\nDi quanto vuoi incrementarte il prezzo?\n> ");
                    disco.incrementoPrezzo(scanner.nextFloat());
                    break;

                case 3:
                    System.out.println("\nQuante canzoni vuoi aggiungere?\n> ");
                    disco.incrementoNumeroCanzoni(scanner.nextFloat());

                    break;

                case 4:
                    execute = !execute;
                    break;
            }
        }
    }
}
