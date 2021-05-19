package com.ui.pacchettowo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton wButton;
    private JPanel panel1;
    private JLabel label1;

    public App() {
        wButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Davide B. 4AIA 17 y.o. " +
                        "Ho fatto questo programma e purtroppo abito a Followonica e usufruisco di tim rame");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        label1 = new JLabel(new ImageIcon("fotowo.png"));
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("OWOWOWOWOWOWOWOWOWOWOWOWO");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
