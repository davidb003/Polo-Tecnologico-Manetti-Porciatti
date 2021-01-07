package com.school_disco;

public class Disco {
    private String titoloDisco;
    private String autore;
    private float prezzo;
    private float numeroCanzoni;

    public Disco() {
    }

    public String getTitoloDisco() {
        return titoloDisco;
    }

    public void setTitoloDisco(String titoloDisco) {
        this.titoloDisco = titoloDisco;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public float getNumeroCanzoni() {
        return numeroCanzoni;
    }

    public void setNumeroCanzoni(float numeroCanzoni) {
        this.numeroCanzoni = numeroCanzoni;
    }

    public void incrementoPrezzo(float newPrezzo) {
        prezzo = prezzo + newPrezzo;
    }

    public void incrementoNumeroCanzoni() {
        numeroCanzoni = numeroCanzoni + 2;
    }

    public void print() {
        System.out.println("Titolo Disco: " + getTitoloDisco() + "\nAutore: " + getAutore() + "\nPrezzo: " + getPrezzo()
        + "\nNumero Canzoni: " + getNumeroCanzoni());
    }

}
