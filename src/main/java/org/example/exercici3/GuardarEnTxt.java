package org.example.exercici3;

import java.io.*;
import java.text.SimpleDateFormat;

public class GuardarEnTxt {

    public void guardarEnTxt(String dir, String nombreFichero) {

        File carpeta = new File(dir);
        File[] archivos = carpeta.listFiles();

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(nombreFichero, true));

            if (archivos != null || archivos.length != 0) {

                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

                // Recorremos todos los ficheros dentro del directorio mostrando el nombre, D o F dependiendo si es un
                // directorio o un fichero y la fecha de la última modificación
                for (int i = 0; i < archivos.length; i++) {

                    File archivo = archivos[i];

                    writer.write(String.format("%s - (%s) - %s",
                            archivo.toString(),
                            archivo.isDirectory() ? "D" : "F",
                            sdf.format(archivo.lastModified())) + "\n");

                    // Si el archivo es directorio volvemos a llamar de manera recursiva a este mismo método para acceder
                    // a los ficheros que hay dentro de este mismo
                    if (archivo.isDirectory()) {
                        guardarEnTxt(archivo.toString(), nombreFichero);
                    }

                }

                writer.close();

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
