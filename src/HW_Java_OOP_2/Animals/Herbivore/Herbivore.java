package HW_Java_OOP_2.Animals.Herbivore;
import HW_Java_OOP_2.Animals.Animal;

public abstract class Herbivore extends Animal {
    public Herbivore(String name) {
        super(name);
    }
    public String feed(){
        return "grass.";
    }
}
