package livestock;

import java.util.UUID;

import javax.swing.Spring;

public class Animal {
    public enum Species {
        Horse, Pig, Sheep
    }
    public Animal(Species species,int age, char sex){
        this.uniqueID = UUID.randomUUID().toString();
        this.species = species;    
        this.age = age;
        this.sex = sex;
    }
    
    public String uniqueID;
    public Species species;    
    public int age;
    public char sex;

}