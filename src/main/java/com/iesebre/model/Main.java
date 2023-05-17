package com.iesebre.model;


import java.util.InputMismatchException;
import java.util.Scanner;

import static com.iesebre.model.CRUD.*;
import static com.iesebre.model.EscripturaLectura.guardarDades;
import static com.iesebre.model.EscripturaLectura.recuperarDades;

/**
 * En aquesta classe s'executarà el programa i es faran les crides a les classes del CRUD i la persistència de dades.
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Sushi[] sushis = new Sushi[5]; // Es crea un vector de mida igual a la quantitat d'objectes sushi que vulguem guardar
    public static int contador = 0;
    public static void main(String[] args) {
        int opcio= 0;
        boolean sortir = false;
        recuperarDades();
        do {
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.println("1. Introduir Sushi");
                    System.out.println("2. Borrar Sushi");
                    System.out.println("3. Llegir Sushi");
                    System.out.println("4. Modificar Sushi");
                    System.out.println("5. Guardar i sortir");
                    System.out.println("Tria una opció (1-5):");
                    opcio = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException ex) {
                    System.out.println("Introdueix un número vàlid!!");
                    scanner.nextLine();
                }
            }

            try {
                if (opcio <= 0 || opcio > 5) throw new InputMismatchException();
            } catch (InputMismatchException ex) {
                System.out.println("Introdueix un número correcte del 1 al 5!!");
            }
            switch (opcio) {
                case 1:
                    crearSushi();
                    break;
                case 2:
                    borrarSushi();
                    break;
                case 3:
                    llegirSushi();
                    break;
                case 4:
                    modificarSushi();
                    break;
                case 5:
                    sortir = true;

                    break;
            }


        } while (!sortir);
        guardarDades();

    }

        }

