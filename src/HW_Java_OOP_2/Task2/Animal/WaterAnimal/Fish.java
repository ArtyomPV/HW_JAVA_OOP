package HW_Java_OOP_2.Task2.Animal.WaterAnimal;

import HW_Java_OOP_2.Task2.Animal.Animal;

public class Fish extends WaterAnimal {
    private int speedSwiming = 12;
    public Fish(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " speedSwiming: %d", swim());
    }

    @Override
    public int swim() {
        return this.speedSwiming;
    }
}
