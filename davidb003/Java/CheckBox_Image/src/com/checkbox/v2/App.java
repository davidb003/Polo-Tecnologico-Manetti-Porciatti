package com.checkbox.v2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel panel1;
    private JCheckBox a80EuroCheckBox;
    private JCheckBox a20EuroCheckBox;
    private JCheckBox a100EuroCheckBox;
    private JCheckBox a10EuroCheckBox;
    private JButton cOwOnfermaButton;
    private JButton anulujButton;
    int total = 0;

    public App() {
        a80EuroCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        anulujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total = total - total;
                a10EuroCheckBox.setSelected(false);
                a20EuroCheckBox.setSelected(false);
                a80EuroCheckBox.setSelected(false);
                a100EuroCheckBox.setSelected(false);

            }
        });

        cOwOnfermaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if(a10EuroCheckBox.isSelected()) {
                    total = total + 10;
                }
                if(a20EuroCheckBox.isSelected()) {
                    total = total + 20;
                }
                if(a80EuroCheckBox.isSelected()) {
                    total = total + 80;
                }
                if(a100EuroCheckBox.isSelected()) {
                    total = total + 100;
                }
                JOptionPane.showMessageDialog(null, "Сума: " + total);
            }
        });

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        a10EuroCheckBox = new JCheckBox(new ImageIcon("topo.png"));
        a100EuroCheckBox = new JCheckBox(new ImageIcon("printer.png"));
        a20EuroCheckBox = new JCheckBox(new ImageIcon("usb.png"));
        a80EuroCheckBox = new JCheckBox(new ImageIcon("scanner.png"));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
