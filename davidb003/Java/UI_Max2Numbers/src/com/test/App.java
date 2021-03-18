package com.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class App {
    private JButton button1;
    private JPanel panel1;
    private JTextField textField1;
    private JLabel lbloutput;
    private JTextField textField2;

    public App() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int textField1Input;
                textField1Input = Integer.parseInt(textField1.getText());
                int textField2Input;
                textField2Input = Integer.parseInt(textField2.getText());
                int result;
                if (textField1Input > textField2Input)
                {
                    lbloutput.setText(String.valueOf(textField1Input));
                }
                else {
                    lbloutput.setText(String.valueOf(textField2Input));
                }


            }
        });
        textField1.addActionListener(new ActionListener() {
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
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
