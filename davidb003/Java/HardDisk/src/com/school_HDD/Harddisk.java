package com.school_HDD;

import java.util.Scanner;

public class Harddisk {

    private final int PUNTI_RPM = 1;
    private final int PUNTI_ACCESSO = -200;
    private final int PUNTI_CAPACITA = 500;
    private Scanner scan = new Scanner(System.in);

    private String marca;
    private int rpm; // GIRI AL MINUTO
    private float accesso; // IN MS
    private int capacita; // IN GB

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public int puntiAccesso () {
        return (int) accesso*PUNTI_ACCESSO;
    }

    public int getCapacita() {
        return capacita;
    }

    public void setCapacita(int capacita) {
        this.capacita = capacita;
    }

    private long punteggio;

    Harddisk() {
        punteggio += capacita*PUNTI_CAPACITA;
    }

    public void leggiDati () {
        System.out.println("Inserisci marca: ");
        marca = scan.nextLine();
        System.out.println("Inserisci rpm per " + marca + ": ");
        rpm = scan.nextInt();
        System.out.println("Inserisci tempo di accesso per " + marca + ": ");
        accesso = scan.nextFloat();
        System.out.println("Inserisci capacità per " + marca + ": ");
        capacita = scan.nextInt();
    }

    public void stampaDati () {
        System.out.println("Marca:     " + marca);
        System.out.println("RPM:       " + rpm);
        System.out.println("Accesso:   " + accesso);
        System.out.println("Capacità:  " + capacita);
        System.out.println("Punteggio: " + punteggio);
    }

    void setPunteggio (int pt) {punteggio += pt;}

}
