package com.ui.calc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel panel1;
    private JTextField additionField1;
    private JTextField additionField2;
    private JButton additionButton;
    private JTextField subtractionField1;
    private JTextField subtractionField2;
    private JButton subtractionButton;
    private JTextField multiplicationField1;
    private JTextField multiplicationField2;
    private JButton multiplicationButton;
    private JTextField divisionField1;
    private JTextField divisionField2;
    private JButton divisionButton;

    public App() {
        additionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int additionNumber1 = Integer.parseInt(additionField2.getText());
                int additionNumber2 = Integer.parseInt(additionField1.getText());
                int additionCalc = additionNumber1 +     additionNumber2;
                JOptionPane.showMessageDialog(null, "Result: " + additionCalc);
            }
        });
        subtractionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int subtractionNumber1 = Integer.parseInt(subtractionField1.getText());
                int subtractionNumber2 = Integer.parseInt(subtractionField2.getText());
                int subtractionCalc = subtractionNumber1 - subtractionNumber2;
                JOptionPane.showMessageDialog(null, "Result: " + subtractionCalc);
            }
        });
        multiplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int multiplicationNumber1 = Integer.parseInt(multiplicationField1.getText());
                int multiplicationNumber2 = Integer.parseInt(multiplicationField2.getText());
                int multiplicationCalc = multiplicationNumber1 * multiplicationNumber2;
                JOptionPane.showMessageDialog(null, "Result: " + multiplicationCalc);
            }
        });
        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int divisionNumber1 = Integer.parseInt(divisionField1.getText());
                int divisionNumber2 = Integer.parseInt(divisionField2.getText());
                int divisionCalc = divisionNumber1 / divisionNumber2;
                JOptionPane.showMessageDialog(null, "Result: " + divisionCalc);
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
