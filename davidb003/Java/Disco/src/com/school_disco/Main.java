package com.school_disco;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        float newPrezzo;

        Disco disco = new Disco();
        boolean execute = true;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            byte select = 0;

            System.out.println("==========Main Menu==========\n" +
                    "1) Output" +
                    "\n2) Aggiungi Prezzo" +
                    "\n3) Aggiungi Canzoni");
            System.out.println("> ");
            select = scanner.nextByte();

            switch (select) {
                case 1:
                    disco.print();
                    break;

                case 2:
                    System.out.println("\nDi quanto vuoi incrementarte il prezzo?\n> ");
                    disco.incrementoPrezzo(scanner.nextByte());
                    break;
            }
        }
    }
}
