# Eleve : FADEL AKRAM
## SIAD

[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/rGfOobSC)


# Class Diagram

![Class diagram](class-diagram.png)

# Answer about software design principles.

## 1. CourseBuilderInterface 

### the `CourseBuilderInterface` violates *DIP* and *OCP* principle, it uses concrete type `Cours` in `build()` method, also any change in in the concrete `Cours` forces changes in the interface

## 2.  CoursBuilder

### teh `CoursBuilder` violated *DIP* because it implements `CourseBuilderInterface`

## 3. CoursDirector 

### the `CoursDirector` violates *DIP* and *OCP* because it depends on `CourseBuilderInterface`

## 4. GestionnaireEmploiDuTemps 
### it violates *SRP* because it mixes domain logic with presentation (printing), *OCP* violated because it hardcoded message formatting, any change in notification format requires changes in the class

## 5. Cours

### violates *SRP*, it encapsulates data but also handles representation with `getDescription` and `getDuree`.