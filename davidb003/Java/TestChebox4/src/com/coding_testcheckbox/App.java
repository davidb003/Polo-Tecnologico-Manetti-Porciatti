package com.coding_testcheckbox;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton confermaButton;
    private JPanel panel1;
    private JCheckBox fumatoreCheckBox;
    private JCheckBox nonFumatoreCheckBox;

    public App() {
        confermaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fumatoreCheckBox.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Hai selezionato FUMATORE");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Hai selezionato NON FUMATORE");
                }
            }
        });
        fumatoreCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        nonFumatoreCheckBox.addActionListener(new ActionListener() {
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
