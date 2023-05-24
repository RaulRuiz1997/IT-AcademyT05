package org.example.exercici5;

import java.io.Serializable;

public class Persona implements Serializable {

    private String nom;
    private String dni;

    public Persona(String nom, String dni) {
        this.nom = nom;
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
