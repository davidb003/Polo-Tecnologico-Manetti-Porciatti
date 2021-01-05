// creare la classe bevanda con i seguenti attributi: nome, gradazione, prezzo, tipo(calda/fredda).
//creare il metodo costruttore per inserire il  nome, gradazione, tipo, prezzo;
//creare metodi get, set e stampa;
//creare il metodo modificaprezzo, per modificare il prezzo incrementandolo del 10%;
//creare il metodo gradoalcolico, per visualizzare se la bevanda è zeroalcol, leggera(se gradazione compresa tra zero
// e otto), normale(da otto a 14), super (oltre i 14);

package com.school_bevanda;

public class Bevanda {
    private String nome;
    private int gradazione;
    public boolean tipo;
    private float prezzo = 0F;

    public Bevanda() {
        this.nome = nome;
        this.gradazione = gradazione;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGradazione() {
        return gradazione;
    }

    public void setGradazione(int gradazione) {
        this.gradazione = gradazione;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public void stampa() {
        System.out.println("Nome: " + getNome() + "\nGradiazione: " + getGradazione() + "\nPrezzo: "
        + getPrezzo() + "\nTipo: Bevanda " + (isTipo() ? "Calda" : "Fredda"));
    }

    public void aggiungiPrezzo(float inputPrezzo) {
        setPrezzo(inputPrezzo);
    }

    public void modificaPrezzo() {
        float currentPrezzo;
        currentPrezzo = getPrezzo();
        float percentagePrezzo;
        percentagePrezzo = (currentPrezzo / 100) * 10;
        float result;
        result = currentPrezzo + percentagePrezzo;
        setPrezzo(result);
    }

    public void gradoAlcolico() {
        if (gradazione == 0) {
            System.out.println("0 Alcohol");
        }
        if (gradazione >= 1 && gradazione <= 8) {
            System.out.println("Leggera");
        }
        if (gradazione >= 9 && gradazione <= 14) {
            System.out.println("Normale");
        }
        if (gradazione >= 15) {
            System.out.println("Super");
        }
        if (gradazione < 0) {
            throw new IllegalStateException("Non puoi inserire numeri negativi");
        }
    }

    public void setTrue () {
        tipo = true;
    }
    public void setFalse () {
        tipo = false;
    }



}
