package com.polytech.tp;

import com.polytech.tp.interfaces.CourseBuilderInterface;

public class CoursBuilder implements CourseBuilderInterface {
    // TODO: Implémenter le pattern Builder

    private Cours cours;
    
    CoursBuilder() {
        this.reset();
    }
    
    @Override
    public void reset() {
        this.cours = new Cours();
    }
    
    @Override
    public CourseBuilderInterface setMatiere(String matiere) {
        this.cours.setMatiere(matiere);
        return this;
    }

    @Override
    public CourseBuilderInterface setEnseignant(String enseignant) {
        this.cours.setEnseignant(enseignant);
        return this;
    }

    @Override
    public CourseBuilderInterface setSalle(String salle)
    {
        this.cours.setSalle(salle);
        return this;
    };

    @Override
    public CourseBuilderInterface setHoraire(String horaire){
        this.cours.setHeureDebut(horaire);
        return this;
    };

    @Override
    public CourseBuilderInterface setDate(String date){
        this.cours.setDate(date);
        return this;
    };
    @Override
    public CourseBuilderInterface setEstOptionnel(boolean estOptionnel)
    {
        this.cours.setEstOptionnel(estOptionnel);
        return this;
    };
    @Override
    public CourseBuilderInterface setNiveau(String niveau)
    {
        this.cours.setNiveau(niveau);
        return this;
    };
    @Override
    public CourseBuilderInterface setNecessiteProjecteur(boolean necessiteProjecteur)
    {
        this.cours.setNecessiteProjecteur(necessiteProjecteur);
        return this;
    };
    
    @Override
    public Cours build() {
        Cours builtCours = this.cours;
        this.reset();
        return builtCours;
    }
}
