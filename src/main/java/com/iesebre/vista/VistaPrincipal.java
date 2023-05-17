package com.iesebre.vista;

import javax.swing.*;

public class VistaPrincipal extends JFrame{
    private JPanel panel;

    public VistaPrincipal() {

        this.setContentPane(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
