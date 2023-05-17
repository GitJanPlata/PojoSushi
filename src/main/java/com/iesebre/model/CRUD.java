package com.iesebre.model;

import java.util.InputMismatchException;
import static com.iesebre.model.Main.*;

/**
 * Aquesta classe s'encarregará de gestionar les operacions CRUD del programa.
 */
public class CRUD {
    /**
     * Aquesta funció omplirá el vector d'objectes Sushi amb els paràmetres inserits per terminal.
     */
    public static void crearSushi() {

        for (int i = 0; contador < sushis.length; i++) {
            // Es crea un objecte de classe Sushi i s'insereixen els paràmetres per terminal
            Sushi sushi = new Sushi();
            System.out.println("Nom del sushi " + (i + 1) + "?");
            sushi.setNomSushi(scanner.nextLine());
            sushi.setNomSushi(scanner.nextLine());

            System.out.println("Peix contingut a " + sushi.getNomSushi() + "?");
            sushi.setPeixContingut(scanner.nextLine());

            int numIngredients = 0;
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.println("Número d'ingredients a " + sushi.getNomSushi() + "?");
                    numIngredients = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException ex) {
                    System.out.println("Introdueix un número vàlid!!");
                    scanner.nextLine(); // per a netejar el buffer del scanner
                }
            }
            sushi.setNumIngredients(numIngredients);

            double gramsProteina = 0;
            validInput = false;
            while (!validInput) {
                try {
                    System.out.println("Grams de proteïna totals a " + sushi.getNomSushi() + "?");
                    gramsProteina = scanner.nextDouble();
                    validInput = true;
                } catch (InputMismatchException ex) {
                    System.out.println("Introdueix un número vàlid!!");
                    scanner.nextLine();
                }
            }
            sushi.setGramsProteina(gramsProteina);

            System.out.println("Quina qualificació d'umami te " + sushi.getNomSushi() + "? (A-Z)");
            sushi.setUmamiRate(scanner.next().charAt(0));

            boolean isVeggie=false;
            validInput = false;
            while (!validInput) {
                try {
                    System.out.println(sushi.getNomSushi() + " és vegetarià ?");
                    isVeggie=scanner.nextBoolean();
                    validInput = true;
                } catch (InputMismatchException ex) {
                    System.out.println("Entrada invàlida, introdueix true o false.");
                    scanner.nextLine();
                }
                sushi.setIsVeggie(isVeggie);
            }
            //s'afegeix un índex al sushi per a poder-lo fer servir d'id
            sushis[contador++] = sushi;

            System.out.println("____________________");
            System.out.println("Sushi creat correctament");
            System.out.println("____________________");

        }
    }

    /**
     * Aquesta funció llegirà el vector de Sushis actual de forma que podrem veure la quantitat i característiques (paràmetres) dels objectes.
     */
     public static void llegirSushi() {
        System.out.println("Sushis existents:");
        System.out.println("____________________");
        if(contador==0) {
            System.out.println("Cap sushi a la llista :(");
            System.out.println("____________________");
        }
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ". " + sushis[i].getNomSushi() + ": ");
            System.out.println(". Peix contingut a " + sushis[i].getNomSushi() + ": " + sushis[i].getPeixContingut());
            System.out.println(". Numero d'ingredients a " + sushis[i].getNomSushi() + ": " + sushis[i].getNumIngredients());
            System.out.println(". Grams de proteina a " + sushis[i].getNomSushi() + ": " + sushis[i].getGramsProteina());
            System.out.println(". Umami rate de " + sushis[i].getNomSushi() + ": " + sushis[i].getUmamiRate());
            System.out.println(". " + sushis[i].getNomSushi() + " es vegetarià? " + sushis[i].getIsVeggie());
            System.out.println("____________________");
        }
    }

    /**
     * Aquesta funció seleccionarà un objecte Sushi pel seu índex i podrem modificar les seves característiques.
     */
     public static void modificarSushi() {

        if (contador == 0) {
            System.out.println("El array està buit. No es pot actualitzar cap sushi.");
        } else {
            System.out.print("Selecciona el Sushi a actualitzar" + " (1-" + contador + ") : ");
            int index = scanner.nextInt()-1;
            if (index+1>contador) System.out.println("Sushi fora de rang!! Escull un numero d'entre 1-"+ contador +": ");
            else if (index >= 0 && index < sushis.length) {
                Sushi sushi = sushis[index];
                System.out.println("Nom del sushi ?");
                sushi.setNomSushi(scanner.nextLine());
                sushi.setNomSushi(scanner.nextLine());
                System.out.println("Peix contingut a " + sushi.getNomSushi() + "?");
                sushi.setPeixContingut(scanner.nextLine());

                int numIngredients = 0;
                boolean validInput = false;
                while (!validInput) {
                    try {
                        System.out.println("Número d'ingredients a " + sushi.getNomSushi() + "?");
                        numIngredients = scanner.nextInt();
                        validInput = true;
                    } catch (InputMismatchException ex) {
                        System.out.println("Introdueix un número vàlid!!");
                        scanner.nextLine(); // per a netejar el buffer del scanner
                    }
                }
                sushi.setNumIngredients(numIngredients);

                double gramsProteina = 0;
                validInput = false;
                while (!validInput) {
                    try {
                        System.out.println("Grams de proteïna totals a " + sushi.getNomSushi() + "?");
                        gramsProteina = scanner.nextDouble();
                        validInput = true;
                    } catch (InputMismatchException ex) {
                        System.out.println("Introdueix un número vàlid!!");
                        scanner.nextLine();
                    }
                }
                sushi.setGramsProteina(gramsProteina);

                System.out.println("Quina qualificació d'umami te " + sushi.getNomSushi() + "? (A-Z)");
                sushi.setUmamiRate(scanner.next().charAt(0));

                boolean isVeggie=false;
                validInput = false;
                while (!validInput) {
                    try {
                        System.out.println(sushi.getNomSushi() + " és vegetarià ?");
                        isVeggie=scanner.nextBoolean();
                        validInput = true;
                    } catch (InputMismatchException ex) {
                        System.out.println("Entrada invàlida, introdueix true o false.");
                        scanner.nextLine();
                    }
                    sushi.setIsVeggie(isVeggie);
                }

                System.out.println("____________________");
                System.out.println("Sushi modificat correctament");
                System.out.println("____________________");
            } else {
                System.out.println("A l'índex seleccionat no es troba cap sushi.");
            }
        }
    }

    /**
     * Aquesta funció esborrarà un dels objectes Sushi segons el número d'índex que li passem.
     */
    public static void borrarSushi() {
        if (contador == 0) {
            System.out.println("No s'ha trobat cap sushi a la llista :(");
        } else {
            int index = 0;
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Selecciona el Sushi a borrar " + "(1-" + contador + ") : ");
                    index = scanner.nextInt() - 1;
                    if (index >= contador) {
                        System.out.println("Numero de sushi no trobat");
                    } else {
                        for (int i = index; i < contador - 1; i++) {
                            sushis[i] = sushis[i + 1];
                        }
                        validInput = true;
                        System.out.println("____________________");
                        System.out.println("Sushi borrat correctament");
                        System.out.println("____________________");
                        contador--;
                    }
                } catch (InputMismatchException ex) {
                    System.out.println("Introdueix un número vàlid!!");
                    scanner.nextLine();
                } catch (ArrayIndexOutOfBoundsException ex) {
                    System.out.println("Introdueix un número vàlid!!");
                    scanner.nextLine();
                }
            }
        }
    }
}
