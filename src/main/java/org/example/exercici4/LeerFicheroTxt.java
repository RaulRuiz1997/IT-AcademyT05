package org.example.exercici4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheroTxt {

    public void leerFicheroTxt(String fichero) {

        int contador;
        String contenido = "";

        try {

            BufferedReader reader = new BufferedReader(new FileReader(fichero));

            while ((contador = reader.read()) != -1) {
                contenido += (char) contador;
            }

            System.out.println(contenido);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
