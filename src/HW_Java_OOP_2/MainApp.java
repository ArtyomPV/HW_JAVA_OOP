package HW_Java_OOP_2;

import HW_Java_OOP_2.Animals.Animal;
import HW_Java_OOP_2.Animals.Herbivore.Duck;
import HW_Java_OOP_2.Animals.Herbivore.Hare;
import HW_Java_OOP_2.Animals.Predator.Eagle;
import HW_Java_OOP_2.Animals.Predator.Shark;
import HW_Java_OOP_2.Animals.Predator.Whale;
import HW_Java_OOP_2.Animals.Predator.Wolf;
import HW_Java_OOP_2.Interfaces.Flyable;
import HW_Java_OOP_2.Interfaces.GroundMoveable;
import HW_Java_OOP_2.Interfaces.Sayable;
import HW_Java_OOP_2.Interfaces.Swimable;
import HW_Java_OOP_2.Zoo.Zoo;
public class MainApp {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Wolf("Wolf"))
                .addAnimal(new Hare("Rabbit"));

        for(Object o: zoo.getAnimals()){
            System.out.println(o);
        }

        for(Animal animal: zoo.getAnimals()){
            System.out.println(animal.getName() + '-' + animal.say());
        }
        zoo.setRadio(new Radio("FM"));
        for(Sayable sayable: zoo.getSayable()){
            System.out.println(sayable.say());
        }
        zoo.addAnimal(new Duck("Donald"));
//        System.out.println(zoo.getSay(zoo.getAnimals().get(2)));
        System.out.println(zoo.getAnimals().get(2).say());
        System.out.println("Животные которые передвигаются по земле:");
        for(GroundMoveable animal: zoo.groundMoveables()){
            System.out.printf("\t%s\n",animal.toString());
        }
        zoo.addAnimal(new Eagle("Eagle"));

        System.out.println("Животные которые могут летать:");
        for(Flyable animal: zoo.flyables()){
            System.out.printf("\t%s скорость: %d\n", animal.toString(), animal.flySpeed());
        }

        System.out.println("Победитель по бегу:");
        System.out.printf("\t%s speed %s\n", zoo.winner(), zoo.winner().runSpeed());

        System.out.println("Победитель по перелетам:");
        System.out.printf("\t%s speed %s\n", zoo.flyWinner(), zoo.flyWinner().flySpeed());

        zoo.addAnimal(new Shark("Bruce"))
                .addAnimal(new Whale("Tulkun"));

        System.out.println("Животные которые могут плавать:");
        for(Swimable animal: zoo.swimable()) {
            System.out.printf("\t%s скорость: %d\n", animal.toString(), animal.swimSpeed());
        }
        System.out.println("Победитель по плаванью:");
        System.out.printf("\t%s speed %s\n", zoo.swimWinner(), zoo.swimWinner().swimSpeed());
    }
}
/*
Реализовать абстрактный класс Animal и его наследники Cat, Dog, и прочее.
Родитель имеет в себе общие данные (пример: кличка, количествор лап, какие звуки издают и тд),
а наследники собственные параметры (тип перемещения). Можно сделать дополнительную абстракцию, хищники и травоядные
 */