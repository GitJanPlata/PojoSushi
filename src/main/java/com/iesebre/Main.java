package com.iesebre;

import com.iesebre.vista.VistaPrincipal;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VistaPrincipal();
            }
        });
    }
}
