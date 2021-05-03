package com.ui.convdengi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// TODO scrivere un'applicazione che effettui la conversione di un importo inserito da un utente in una casella
//  di testo mediante un "ComboBox" valute; il calcolo effettuato mediante un pulsante viene visualizzato in una label

public class App {
    private JPanel panel1;
    private JTextField textField1;
    private JComboBox cumBox1;
    private JButton convertisciButton;
    private JLabel resultLabel;

    public App() {
        convertisciButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int inputTextField = Integer.parseInt(textField1.getText());
                String inputComboBox = (String) cumBox1.getSelectedItem();

                int calcBGN;
                int calcROlei;

                if (inputComboBox == "Bulgarian Lev") {
                    calcBGN = inputTextField / 2;
                    resultLabel.setText(String.valueOf(calcBGN));
                }

                if (inputComboBox == "Romanian Leu") {
                    calcROlei = inputTextField / 5;
                    resultLabel.setText(String.valueOf(calcROlei));
                }
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
