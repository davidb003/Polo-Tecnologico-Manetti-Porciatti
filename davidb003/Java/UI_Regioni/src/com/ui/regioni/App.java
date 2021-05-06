package com.ui.regioni;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel panel1;
    private JComboBox comboBox1;
    private JLabel ImageReggioCalabria;
    private JCheckBox pietanza1;
    private JCheckBox pietanza2;
    private JCheckBox pietanza3;
    private JButton viewInfoButton;
    private JLabel PietanzeDesc2;
    private JLabel PietanzeDesc1;
    private JLabel PietanzeDesc3;
    private JButton viewAPhotoOfButton;
    private JLabel CatanzaroImage;
    private JLabel LameziaTermeImage;
    private JLabel CosenzaImage;
    private JLabel CrotoneImage;
    private JLabel AcriImage;
    private JLabel TaurianovaImage;
    private JLabel Taurianova;

    public App() {
        viewAPhotoOfButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox1.getSelectedItem() == "Reggio Calabria") {
                    ImageReggioCalabria.setVisible(true);
                }
                if (comboBox1.getSelectedItem() == "Catanzaro") {
                    CatanzaroImage.setVisible(true);
                }
                if (comboBox1.getSelectedItem() == "Lamezia Terme") {
                    LameziaTermeImage.setVisible(true);
                }
                if (comboBox1.getSelectedItem() == "Cosenza") {
                    CosenzaImage.setVisible(true);
                }
                if (comboBox1.getSelectedItem() == "Crotone") {
                    CrotoneImage = new JLabel(new ImageIcon("crotone.png"));
                }
                if (comboBox1.getSelectedItem() == "Acri") {
                    AcriImage.setVisible(true);
                }
                if (comboBox1.getSelectedItem() == "Taurianova") {
                    Taurianova.setVisible(true);
                }
                if (comboBox1.getSelectedItem() == "Select ...") {
                    JOptionPane.showMessageDialog(null, "Nenno, la ghe' non hai selezionato " +
                            "niente");
                }

            }
        });
        viewInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pietanza1.isSelected()) { //checkbox
                    PietanzeDesc1.setVisible(true); //Label
                }
                if (pietanza2.isSelected()) {
                    PietanzeDesc2.setVisible(true);
                }
                if (pietanza3.isSelected()) {
                    PietanzeDesc3.setVisible(true);
                }

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        ImageReggioCalabria = new JLabel(new ImageIcon("reggiocalabria.png"));
        CatanzaroImage = new JLabel(new ImageIcon("catanzaro.png"));
        CosenzaImage = new JLabel(new ImageIcon("cosenza.png"));
        CrotoneImage = new JLabel(new ImageIcon("crotone.png"));
        LameziaTermeImage = new JLabel(new ImageIcon("lameziaterme.png"));
        TaurianovaImage = new JLabel(new ImageIcon("taurianova.png"));
        AcriImage = new JLabel(new ImageIcon("acri.png"));

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
