package com.ui.dadi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;

public class App {
    private JPanel panel1;
    private JTextField textField1;
    private JLabel Jdado1;
    private JLabel Jdado2;
    private JLabel Jdado3;
    private JLabel Jvincinta;
    private JButton STARTButton;

    public App() {
        STARTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();

                int puntata = Integer.parseInt(textField1.getText());

                int vincinta = 0;

                int dado1 = random.nextInt(9);
                int dado2 = random.nextInt(9);
                int dado3 = random.nextInt(9);


                // Uncomment this for debugging
                //int dado1 = 5;
                //int dado2 = 5;
                //int dado3 = 3;


                Jdado1.setText(String.valueOf(dado1));
                Jdado2.setText(String.valueOf(dado2));
                Jdado3.setText(String.valueOf(dado3));



                if (dado1 == dado2) { // Check if 2 numbers are equal
                    if (dado2 == dado3) {
                        vincinta = puntata * 4;
                    }
                    else {
                        vincinta = puntata * 2;
                    }
                }
                if (dado1 == dado3) {
                    if (dado2 == dado3) {
                        vincinta = puntata * 4;
                    }
                    else {
                        vincinta = puntata * 2;
                    }
                }
                if (dado2 == dado3) {
                    if (dado1 == dado3) {
                        vincinta = puntata * 4;
                    }
                    else {
                        vincinta = puntata * 2;
                    }
                }

                Jvincinta.setText(String.valueOf(vincinta));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("UWU");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
