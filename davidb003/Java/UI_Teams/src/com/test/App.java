package com.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class App {
    private JButton button1;
    private JPanel panel1;
    private JLabel lbloutput;
    private JTextField jtextCity;
    private JTextField jtextTeamName;
    private JTextField jtextWonMatches;
    private JTextField jtextLostMatches;
    private JTextField jtextDrawMatches;
    private JButton calculateButton;

    public App() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO creare la classe giocatore con gli attributi:
                //- nome squadra
                //- città
                //- partite vinte
                //- partite perse
                //- partite pareggiate
                //
                //Creare la form per inserire gli attributi, un tasto calcola, con il quale viene calcolòato e visualizzato il risultato
                //in classifica (dati da 3 punti per ogni vincita)
                
                String teamName;
                String city;
                String wonMatches;
                String lostMatches;
                String drawMatches;

                teamName = Integer.parseInt(jtextTeamName.getText());

            }
        });
        jtextTeamName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        lbloutput.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
        jtextCity.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        jtextWonMatches.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        jtextLostMatches.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        jtextDrawMatches.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
