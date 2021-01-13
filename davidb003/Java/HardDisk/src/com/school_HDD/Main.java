package com.school_HDD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        final int MAX_HD = 5;
        Harddisk[] hd = new Harddisk[MAX_HD];
        int timer; // DURATA DEL TEST
        int clock = 0;

        timer = (scan.nextInt())*1000; // IN MS

        for (Harddisk disco: hd) {
            disco.leggiDati();
        }

        for (int i = 0; i < timer; i++) {
            for (Harddisk disco: hd) {
                disco.setPunteggio((disco.puntiAccesso()));
                if (clock == 60000) {
                    disco.setPunteggio(disco.getRpm());
                    clock = 0;
                }
                clock++;
            }
        }

        for (Harddisk disco : hd) {
            disco.stampaDati();
        }
    }
}