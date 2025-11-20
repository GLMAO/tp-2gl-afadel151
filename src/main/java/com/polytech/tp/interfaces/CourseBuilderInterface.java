package com.polytech.tp.interfaces;

import com.polytech.tp.Cours;



public interface CourseBuilderInterface {
    public void reset();

    public CourseBuilderInterface setMatiere(String matiere);
    public CourseBuilderInterface setEnseignant(String enseignant);
    public CourseBuilderInterface setSalle(String salle);
    public CourseBuilderInterface setHoraire(String horaire);
    public CourseBuilderInterface setDate(String date);
    public CourseBuilderInterface setEstOptionnel(boolean estOptionnel);
    public CourseBuilderInterface setNiveau(String niveau);
    public CourseBuilderInterface setNecessiteProjecteur(boolean necessiteProjecteur);

    public Cours build();
}
