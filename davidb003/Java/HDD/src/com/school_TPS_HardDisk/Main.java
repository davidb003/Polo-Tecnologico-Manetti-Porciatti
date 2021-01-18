package com.school_TPS_HardDisk;

/*Lavoro svolto da Albini Giovanni, Bacci Simone e Casaburi Alessio */

//Importazione delle varie classi utili
import java.util.Scanner;

//Creazione della classe HardDisk


//Creazione della classe main

class main
{
    //Dichiarazione del progrmma principale
    public static void main(String[]args)
    {
        //Creazione dell'istanza per l'input da tastiera delle stringhe
        Scanner tastiera = new Scanner(System.in);

        //Creazione dell'istanza per l'input da tastiera dei numeri
        Scanner myObj = new Scanner(System.in);

        //Dichiarazione delle variaibli
        int dimensione; //Contiene la dimensione del vettore
        int i; //Indice di conteggio per i cicli for
        int rpm_harddisk; //Variabile utilizzata come parametro per i metodi set
        double accesso_harddisk; //Variabile utilizzata come parametro per i metodi set
        double capacità_harddisk; //Variabile utilizzata come parametro per i metodi set

        //Richiesta della dimensione del vettore
        System.out.println("Inserisci la dimensione del vettore: ");
        dimensione = myObj.nextInt();

        //Creazione ed inizializzazione del vettore
        HardDisk vet[] = new HardDisk[dimensione];

        //Spaziatura
        System.out.print("\n");

        //Creazione ciclo for per richiesta delle varie informazioni di ogni singolo Hard Disk
        for(i = 0; i < dimensione; i++)
        {
            //Creazione dell'istanza di goni singolo hard disk
            vet[i] = new HardDisk();

            //Richiesta delle del valore dei rpm per ogni singolo hard disk
            System.out.println("Inserisci il valore di rpm del disco "+(i+1) +":");
            rpm_harddisk = myObj.nextInt();
            vet[i].setRpm(rpm_harddisk);

            //Richiesta delle del valore del tempo di accesso per ogni singolo hard disk
            System.out.println("Inserisci il valore del tempo di accesso del disco "+(i+1) + ":");
            accesso_harddisk = myObj.nextDouble();
            vet[i].setAccesso(accesso_harddisk);


            //Richiesta delle del valore della capacità per ogni singolo hard disk
            System.out.println("Inserisci il valore della capacità del disco "+(i+1) + ":");
            capacità_harddisk = myObj.nextDouble();
            vet[i].setCapacità(capacità_harddisk);

            //Spaziatura
            System.out.print("\n");
        }

        //Creazione ed inizializzazione delle variabili maggiore e peggiore di tipo HardDisk
        HardDisk migliore = vet[0];
        HardDisk peggiore = vet[0];

        //Creazione del ciclo for per stabilire il pesggiore hard disk
        for(i=0;i<dimensione;i++)
        {
            if(peggiore.Punteggio()>vet[i].Punteggio())
            {
                peggiore = vet[i];
            }
        }

        //Creazione del ciclo for per stabilire il migliore hard disk
        for(i=0;i<dimensione;i++)
        {
            if(migliore.Punteggio()<vet[i].Punteggio())
            {
                migliore = vet[i];
            }
        }

        //Stampa a schermo del migliore hard disk
        System.out.println("L'HardDisk migliore è: ");
        migliore.StampaAttributi();

        //Spaziatura
        System.out.print("\n");

        //Stampa a schermo del peggiore hard disk
        System.out.println("L'HardDisk peggiore è: ");
        peggiore.StampaAttributi();

        //Spaziatura
        System.out.print("\n");
    }
}
