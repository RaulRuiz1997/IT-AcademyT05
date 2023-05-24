package org.example;

import org.example.exercici1.ListarContenidoDirectorio;
import org.example.exercici2.ListarArbolDeDirectorios;
import org.example.exercici3.GuardarEnTxt;
import org.example.exercici4.LeerFicheroTxt;
import org.example.exercici5.Persona;
import org.example.exercici5.SerialitzadorObjecte;

public class Main {

    public static void main(String[] args) {

        ListarContenidoDirectorio listar = new ListarContenidoDirectorio();
        ListarArbolDeDirectorios listarArbolDeDir = new ListarArbolDeDirectorios();
        GuardarEnTxt guardarEnTxt = new GuardarEnTxt();
        LeerFicheroTxt leerFicheroTxt = new LeerFicheroTxt();
        SerialitzadorObjecte serialitzadorObjecte = new SerialitzadorObjecte();
        Persona persona = new Persona("Raul", "11111111A");

        // Esta carpeta está dentro del proyecto, la puedes mirar, tiene unos ficheros words vacíos
        String ruta = "Carpeta";
        String nombreFichero = "datos_guardados.txt";

        // Exercici 1 --------------------------------------------------------------------------------------------------
        //System.out.println("---Exercici 1---\n" + listar.ordenarAlfabeticamenteContenidoDeUnDirectorio(ruta));

        // Exercici 2 --------------------------------------------------------------------------------------------------
        System.out.println("---Exercici 2---");
        //listarArbolDeDir.listarArbolDeDirectorios(ruta);

        // Exercici 3 --------------------------------------------------------------------------------------------------
        System.out.println("---Exercici 3---");
        //guardarEnTxt.guardarEnTxt(ruta, nombreFichero);
        System.out.println("Fichero guardado en txt");

        // Exercici 4 --------------------------------------------------------------------------------------------------
        System.out.println("---Exercici 4---");
        //leerFicheroTxt.leerFicheroTxt(nombreFichero);

        // Exercici 5 --------------------------------------------------------------------------------------------------
        System.out.println("---Exercici 5---");
        System.out.println("Serializamos el objeto: " + persona);
        serialitzadorObjecte.serialitzarObjecte(persona); // Hay un fichero llamado exercici5.ser que se crea al llamar al método

        System.out.println("Deserializamos el objeto: " + serialitzadorObjecte.deserialitzarObjecte());

    }

}