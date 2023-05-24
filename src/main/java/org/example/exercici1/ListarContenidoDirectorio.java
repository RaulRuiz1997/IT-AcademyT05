package org.example.exercici1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListarContenidoDirectorio {

    public List<String> ordenarAlfabeticamenteContenidoDeUnDirectorio(String dir) {

        File carpeta = new File(dir);
        String[] listado = carpeta.list();
        List<String> ficheros = new ArrayList<>();

        if (listado == null || listado.length == 0) {
            System.out.println("No hay elementos dentro de la carpeta actual");
        } else {
            for (int i = 0; i < listado.length; i++) {
                ficheros.add(listado[i]);
            }
        }

        // Ordenamos alfabéticamente la lista
        Collections.sort(ficheros);

        return ficheros;

    }

}
