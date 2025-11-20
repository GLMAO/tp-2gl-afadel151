package com.polytech.tp;



import com.polytech.tp.interfaces.Observer;

public class Etudiant implements  Observer {
    private String nom;

    public Etudiant(String nom) {
        this.nom = nom;
    }

    @Override
    public void update(String message) {
        System.out.println("Étudiant " + nom + " a reçu la notification : " + message);
    }


}