package com.iesebre.model;

import java.io.*;

import static com.iesebre.model.Main.contador;
import static com.iesebre.model.Main.sushis;
/**
 * Aquesta classe s'encarregarà de persistir les dades del programa amb les opcions de guardar/carregar dades.
 */
public class EscripturaLectura{
    /**
     * Aquesta funció guardará les dades de l'array amb objectes Sushi dintre de l'arxiu "sushi.dat".
     */
    public static void guardarDades() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("sushi.dat");
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            for (int i = 0; i < contador; i++) {
                dataOutputStream.writeUTF(sushis[i].getNomSushi());
                dataOutputStream.writeUTF(sushis[i].getPeixContingut());
                dataOutputStream.writeInt(sushis[i].getNumIngredients());
                dataOutputStream.writeDouble(sushis[i].getGramsProteina());
                dataOutputStream.writeChar(sushis[i].getUmamiRate());
                dataOutputStream.writeBoolean(sushis[i].getIsVeggie());
            }
            dataOutputStream.close();
            fileOutputStream.close();
            System.out.println("____________________");
            System.out.println("Dades guardades a l'arxiu.");
            System.out.println("____________________");
        } catch (IOException ex) {
            System.out.println("____________________");
            System.out.println("Error al guardar dades de l'arxiu.");
            System.out.println("____________________");

        }
    }
    /**
     * Aquesta funció recuperará les dades del vector amb objectes Sushi dintre de l'arxiu "sushi.dat" sobre l'última sessió guardada.
     */
    public static void recuperarDades() {
        try {
            FileInputStream fileInputStream = new FileInputStream("sushi.dat");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            contador = 0;
            while (dataInputStream.available() > 0) {
                Sushi sushi = new Sushi();
                sushi.setNomSushi(dataInputStream.readUTF());
                sushi.setPeixContingut(dataInputStream.readUTF());
                sushi.setNumIngredients(dataInputStream.readInt());
                sushi.setGramsProteina(dataInputStream.readDouble());
                sushi.setUmamiRate(dataInputStream.readChar());
                sushi.setIsVeggie(dataInputStream.readBoolean());
                sushis[contador++] = sushi;
            }
            dataInputStream.close();
            fileInputStream.close();
            System.out.println("____________________");
            System.out.println("Dades recuperades de l'arxiu.");
            System.out.println("____________________");

        } catch (IOException ex) {
            System.out.println("____________________");
            System.out.println("Error al recuperar dades de l'arxiu.");
            System.out.println("____________________");

        }
    }
}