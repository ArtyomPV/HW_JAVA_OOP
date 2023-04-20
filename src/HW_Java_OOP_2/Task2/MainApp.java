package HW_Java_OOP_2.Task2;

import HW_Java_OOP_2.Task2.Animal.Animal;
import HW_Java_OOP_2.Task2.Animal.ReptileAnimal.Frog;
import HW_Java_OOP_2.Task2.Animal.ReptileAnimal.Snake;
import HW_Java_OOP_2.Task2.Animal.WaterAnimal.Fish;
import HW_Java_OOP_2.Task2.Animal.WaterAnimal.Jellyfish;
import HW_Java_OOP_2.Task2.HomeZoo.HomeZoo;
import HW_Java_OOP_2.Task2.Interfaces.Creepable;
import HW_Java_OOP_2.Task2.Interfaces.Jumpable;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        HomeZoo zoo = new HomeZoo();
        zoo.showAnimals1()
                .addAnimal(new Snake("Ground Worm"))
                .addAnimal(new Frog("Crazy Frog"))
                .addAnimal(new Jellyfish("Arny"))
                .addAnimal(new Fish("Nemo"))
                .showAnimals2();

        List<Jumpable> jumpAnimals = zoo.getJumpable();
        System.out.println("\n\tЖивоные которые умеют прыгать:");
        for(Jumpable animal: jumpAnimals){
            System.out.println(animal);
        }
        List<Creepable> creepablesAnimals = zoo.getCreepable();
        System.out.println("\n\tЖивоные которые умеют ползать:");
        for(Creepable animal: creepablesAnimals){
            System.out.println(animal);
        }
    }
}
