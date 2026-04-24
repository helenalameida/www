package model;

public abstract class Animal {
    private String name;
    private int age;
    private int speed;
    private double weight;
    private String habitat;
    private boolean isWild;

    public Animal(String name, int age, int speed, double weight, String habitat, boolean isWild) {
        this.name = name;
        this.speed = speed;
        this.age = age;
        this.weight = weight;
        this.habitat = habitat;
        this.isWild = isWild; 
    }

//Method to be OVERIDDEN by subclass

public void makeSound(){
    System.out.println(name + " makes a generic sound ");
}

//Method to be OVERRIDEN by subclass
public void sleep(){
    System.out.println(name + " is sleeping ");
}
    
//First version of move - will be OVERLOAD in
public void move(int distance){
    System.out.println(name + " moved " + 
    distance +  " meters at " +
    speed + "km/h"
);
} 

public void displayInfo(){
    System.out.println( "Name: " + name);
    System.out.println( "Age: " + age + " Years");
    System.out.println( "Weight: " + weight + " kg");
    System.out.println( "Habitat: " + habitat + " habitat");
    System.out.println( "Wild: " + isWild);
}

public String getName() {
    return name;
}

public int getAge() {
    return age;
}

public String getHabitat() {
    return habitat;
}

public int getSpeed() {
    return speed;
}

public double getWeight() {
    return weight;
}

public boolean getIsWild() {
    return isWild;
}

public void setAge(int age) {
    this.age = age;
}

}