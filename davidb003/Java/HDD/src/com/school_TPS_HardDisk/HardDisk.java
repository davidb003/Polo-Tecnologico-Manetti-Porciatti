package com.school_TPS_HardDisk;

public class HardDisk
{
    //Dichiarazione delle variabili principali
    private String marca;
    private int rpm;
    private double accesso;
    private double capacità;

    //Dichiarazione delle variabili che stabiliscono i punti
    final int PUNTI_RPM = 1;
    final int PUNTI_ACCESSO = -200;
    final int PUNTI_CAPACITA = 500;

    //Creazione del metodo costruttore
    public HardDisk()
    {
        this.marca = "";
        this.rpm = 0;
        this.accesso = 0;
        this.capacità = 0;
    }

    //Creazione metodi set per ogni attributo
    public void setMarca(String ext_marca)
    {
        this.marca = ext_marca;
    }

    public void setRpm(int ext_rpm)
    {
        this.rpm = ext_rpm;
    }

    public void setAccesso(double ext_accesso)
    {
        this.accesso = ext_accesso;
    }

    public void setCapacità(double ext_capacità)
    {
        this.capacità = ext_capacità;
    }

    //Creazione dei metodi get per ogni attributo
    public String getMarca()
    {
        return this.marca;
    }

    public int getRpm()
    {
        return this.rpm;
    }

    public double getAccesso()
    {
        return this.accesso;
    }

    public double getCapacità()
    {
        return this.capacità;
    }

    //Dichiarazione del metodo per stampare tutti gli attributi
    public void StampaAttributi()
    {
        System.out.println("Marca:\t"+this.marca + "\nRPM:\t"+this.rpm + "\nTempo di accesso:\t"+this.accesso + "\nCapacità:\t"+this.capacità);
    }

    //Creazione del metodo per stabilire i vari punteggi
    public int Punteggio()
    {
        //Dichiarazione delle variabile che conterrà via via il numero dei punti
        int punti = 0;

        //Somma dei punti derivanti dalla caratteristica degli RPM
        punti = (int) (punti + (this.rpm * this.PUNTI_RPM));

        //Somma dei punti derivanti dalla caratteristica del tempo di accesso
        punti = (int) (punti + (this.accesso * this.PUNTI_ACCESSO));

        //Somma dei punti derivanti dalla caratteristica della capacità
        punti = (int) (punti + (this.capacità * this.PUNTI_CAPACITA));

        //Restituzione del valore della variabile punti
        return punti;
    }
}