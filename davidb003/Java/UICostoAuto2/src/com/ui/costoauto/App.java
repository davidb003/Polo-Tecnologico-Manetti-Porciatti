package com.ui.costoauto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton calcolaButton;

    public App() {
        calcolaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int inputGiorni; int inputCosto;
                inputGiorni = Integer.parseInt(textField1.getText());
                inputCosto = Integer.parseInt(textField2.getText());

                int calcolo;
                calcolo = inputCosto * inputGiorni;

                JOptionPane.showMessageDialog(null, "Da pagare: " + calcolo);
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
