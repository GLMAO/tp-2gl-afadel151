package com.polytech.tp;

import com.polytech.tp.interfaces.CourseBuilderInterface;
import com.polytech.tp.interfaces.ICours;


public class CoursDirector {
    private CourseBuilderInterface builder;

    public CoursDirector(CourseBuilderInterface builder) {
        this.builder = builder;
    }

    public void changeBuilder(CourseBuilderInterface builder) {
        this.builder = builder;
    }

    // makers
    public ICours construireCoursMaths() {
        builder.reset();
        builder.setMatiere("GL")
               .setEnseignant("Dr. Mazari")
               .setSalle("D15")
               .setDate("2025-11-20")
               .setHoraire("10:00")
               .setEstOptionnel(false)
               .setNiveau("Master 1")
               .setNecessiteProjecteur(true);
        return builder.build();
    }
}
