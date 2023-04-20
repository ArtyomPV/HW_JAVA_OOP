package HW_Java_OOP_2.Task2.HomeZoo;

import HW_Java_OOP_2.Task2.Animal.Animal;
import HW_Java_OOP_2.Task2.Interfaces.Creepable;
import HW_Java_OOP_2.Task2.Interfaces.Jumpable;
import HW_Java_OOP_2.Task2.Interfaces.Swimable;

import java.util.ArrayList;
import java.util.List;

public class HomeZoo {
    List<Animal> animals = new ArrayList<>();

    public HomeZoo addAnimal(Animal animal){
        animals.add(animal);
        return this;
    }

    public HomeZoo showAnimals1(){
        System.out.println(animals);
        return this;
    }
    public HomeZoo showAnimals2() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        return this;
    }

    public List<Swimable> getSwimming(){
        List<Swimable> swimables = new ArrayList<>();
        for(Animal animal:animals){
           if (animal instanceof Swimable){
               swimables.add(animal);
           }
        }
        return  swimables;
    }

    public List<Jumpable> getJumpable(){
        List<Jumpable> jumpables = new ArrayList<>();
        for(Animal animal: animals){
            if(animal instanceof Jumpable){
                jumpables.add((Jumpable) animal);
            }
        }
        return jumpables;
    }

    public List<Creepable> getCreepable(){
        List<Creepable> creepables = new ArrayList<>();
        for(Animal animal: animals){
            if(animal instanceof Creepable)
                creepables.add((Creepable)animal);
        }
        return creepables;
    }
}
