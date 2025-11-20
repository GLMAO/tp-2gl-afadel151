package com.polytech.tp;

import com.polytech.tp.interfaces.ICours;

public class Cours implements ICours {
    private String matiere;
    private String enseignant;
    private String salle;
    private String date;
    private String heureDebut;
    private boolean estOptionnel;
    private String niveau;
    private boolean necessiteProjecteur;

    
    public Cours(String matiere, String enseignant, String salle, String date, 
                 String heureDebut, boolean estOptionnel, String niveau, boolean necessiteProjecteur) {
        this.matiere = matiere;
        this.enseignant = enseignant;
        this.salle = salle;
        this.date = date;
        this.heureDebut = heureDebut;
        this.estOptionnel = estOptionnel;
        this.niveau = niveau;
        this.necessiteProjecteur = necessiteProjecteur;
    }

    public Cours(){}
    @Override
    public String getDescription() {
        return "Cours de " + matiere + " avec " + enseignant + " (" + salle + ")";
    }

    @Override
    public double getDuree() {
        return 1.5; 
    }
    // getters
    
    
    public String getMatiere() { return matiere; }
    public String getEnseignant() { return enseignant; }
    // setters
    public void setMatiere(String matiere) { this.matiere = matiere; }
    public void setEnseignant(String enseignant) { this.enseignant = enseignant; }
    public void setSalle(String salle) { this.salle = salle; }
    public void setDate(String date) { this.date = date; }
    public void setHeureDebut(String heureDebut) { this.heureDebut = heureDebut; }
    public void setEstOptionnel(boolean estOptionnel) { this.estOptionnel = estOptionnel; }
    public void setNiveau(String niveau) { this.niveau = niveau; }
    public void setNecessiteProjecteur(boolean necessiteProjecteur) { this.necessiteProjecteur = necessiteProjecteur; }

}