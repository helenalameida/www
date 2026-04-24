package model;

public class Dog extends Animal {
    private String breed;
    private boolean isVaccinated;
    private String trainingLevel; // beginner, intermedia, advanced
    private int barkVolume; // decibels

    public Dog(String name, int age, int speed, double weight, String habitat, 
               boolean isWild, String breed, boolean isVaccinated, 
               String trainingLevel, int barkVolume) {
        
        super(name, age, speed, weight, habitat, isWild); 
        
        this.breed = breed;
        this.isVaccinated = isVaccinated;
        this.trainingLevel = trainingLevel;
        this.barkVolume = barkVolume;
    }

   
}