package com.school_Coding_CountLettersInAString;

public class Main {

    public static void main(String[] args) {
            String string = "OwO UwU";
            int count = 0;

            for(int i = 0; i < string.length(); i++) {
                if(string.charAt(i) != ' ')
                    count++;
            }

            System.out.println("La stringa " + string + " contiene " + count + " caratteri");
        }
}
