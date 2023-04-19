package HW_Java_OOP_2.Animals.Predator;

import HW_Java_OOP_2.Animals.Animal;

public abstract class Predator extends Animal {
    public Predator(String name) {
        super(name);
    }

    public String feed(){
        return "meat";
    }
}
