package com.polytech.tp;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

import com.polytech.tp.interfaces.ICours;
import com.polytech.tp.interfaces.Observer;
import com.polytech.tp.interfaces.Subject;

public class GestionnaireEmploiDuTemps implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private List<ICours> listeCours = new ArrayList<>();
    
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers(String message) 
    {
        observers.forEach(o -> o.update(message));
    }

    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        System.out.println("Nouveau cours ajouté : " + cours.getDescription());
        // TODO: C'est ici qu'il faudrait notifier les étudiants (Observer pattern)
        this.notifyObservers("Nouveau cours ajouté : " + cours.getDescription());
    }

    public void modifierCours(ICours cours, String message) {
        // Logique de modification...
        System.out.println("Cours modifié : " + message);
        // TODO: Notifier les observateurs ici aussi
        this.notifyObservers("Cours modifié : " + message);
    }



    public void setChangement(String string) {
        // TODO Auto-generated method stub
        this.notifyObservers(string);
    }
}