package com.school_Coding_FlipACoin;

public class Main {

    public static void main(String[] args) {
        Coin coin = new Coin();

        // Tails = Testa
        // Heads = Croce
        // Tosses = Lanci

        double numTosses = 100;
        double tails = 0;
        for(int i =0; i < numTosses; i++){
            if(Coin.isNTales()){
                tails++;
            }
        }
        System.out.println("Lanciando la moneta " + numTosses + " volte si è ottenuto TESTA in una percentuale di " +
                tails/numTosses);

        for(int i =0; i < numTosses; i++){
            if(Coin.isNHeads()){
                tails++;
            }
        }
        System.out.println("Lanciando la moneta " + numTosses + " volte si è ottenuto CROCE in una percentuale di " +
                tails/numTosses);


    }
}
