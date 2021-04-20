package com.ui.hotel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton confirmButton;
    private JCheckBox smokercheckBox1;
    private JCheckBox matrimonialecheckBox2;
    private JCheckBox vistamarecheckBox3;
    private JButton infobutton;
    private JButton viewPhotobutton;
    private JPanel panel1;
    private JLabel maxTryReached;
    private JLabel HotelPhoto;
    private JButton wychodzićButton;
    private JComboBox comboBox1;
    private JLabel textPlat;

    boolean isSmokerSelected = false;
    boolean isMatrimonialeSelected = false;
    boolean isVistaMareSelected = false;
    String output = "Wybrałeś:\n";




    public App() {
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(smokercheckBox1.isSelected()) {
                    output = output + "\n- Fumatore";
                }
                if(matrimonialecheckBox2.isSelected()) {
                    output = output + "\n- Camera Matrimoniale";
                }
                if(vistamarecheckBox3.isSelected()) {
                    output = output + "\n- Parcheggio";
                }

                String inputComboBox;
                inputComboBox = (String) comboBox1.getSelectedItem();


                JOptionPane.showMessageDialog(null, output + "\n\nWybrana metoda płatności:"
                        + inputComboBox);
                confirmButton.setVisible(false);
                comboBox1.setVisible(false);
                textPlat.setVisible(false);
                maxTryReached.setText("Koniec programu.\n Uruchom go ponownie, aby spróbować ponownie");

            }
        });
        infobutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Davide B.\n4AIA");
            }
        });
        viewPhotobutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HotelPhoto.setVisible(true);
                viewPhotobutton.setVisible(false);
            }
        });
        wychodzićButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Warsaw Hotel UwU");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        HotelPhoto = new JLabel(new ImageIcon("fotowo.png"));
        HotelPhoto.setVisible(false);
    }
}
