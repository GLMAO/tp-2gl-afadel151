package com.polytech.tp;

import java.beans.PropertyChangeEvent;

import com.polytech.tp.interfaces.Observer;

public class Responsable implements Observer{
    private final String nom;

    public Responsable(String nom) {
        this.nom = nom;
    }


    @Override
    public void update(String message) {
        System.out.println("Notification pour le responsable " + nom + " : " + message);
    }

    
}
