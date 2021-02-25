package com.school_Coding_FlipACoin;

import java.util.Random;

public class Coin {
    public static boolean isNTales() {
        Random rand = new Random();
        int numberOfTosses = 1;
        int numberOfHeads = 0;
        int numberOfTails = 0;

        for(int i = 1; i <= numberOfTosses; i++){
            int value = rand.nextInt(2);
            if(value == 0){
                numberOfTails++;
            }
            else {
                numberOfHeads++;
            }
        }
        if (numberOfTails == 1){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isNHeads() {
        Random rand = new Random();
        int numberOfTosses = 1;
        int numberOfHeads = 0;
        int numberOfTails = 0;

        for(int i = 1; i <= numberOfTosses; i++){
            int value = rand.nextInt(2);
            if(value == 0){
                numberOfHeads++;
            }
            else {
                numberOfTails++;
            }
        }
        if (numberOfHeads == 1){
            return true;
        }
        else {
            return false;
        }
    }
}
