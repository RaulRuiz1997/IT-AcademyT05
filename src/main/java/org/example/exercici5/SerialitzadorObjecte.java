package org.example.exercici5;

import java.io.*;

public class SerialitzadorObjecte {

    public void serialitzarObjecte(Object objectSerializable) {

        try {

            ObjectOutputStream escribirFichero = new ObjectOutputStream(new FileOutputStream("Carpeta/exercici5.ser"));

            escribirFichero.writeObject(objectSerializable);

            escribirFichero.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public Object deserialitzarObjecte() {

        Object object = null;
        
        try {

            ObjectInputStream leerFichero = new ObjectInputStream(new FileInputStream("Carpeta/exercici5.ser"));

            object = leerFichero.readObject();

            leerFichero.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return object;

    }

}
