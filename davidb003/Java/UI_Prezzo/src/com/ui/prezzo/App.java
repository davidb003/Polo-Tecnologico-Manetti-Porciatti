package com.ui.prezzo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel panel1;
    private JLabel text;
    private JLabel text2;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JButton OKButton;

    public App() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int inputSum_Int = Integer.parseInt(textField1.getText());
                int inputPercentage = Integer.parseInt((String) comboBox1.getSelectedItem());

                int percentage = inputSum_Int * inputPercentage / 100;

                int sumFinal = inputSum_Int + percentage;

                JOptionPane.showMessageDialog(null, "Тотал: " + sumFinal);
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("UwU");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
