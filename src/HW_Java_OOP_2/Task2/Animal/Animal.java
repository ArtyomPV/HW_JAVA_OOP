package HW_Java_OOP_2.Task2.Animal;

import HW_Java_OOP_2.Task2.Interfaces.Swimable;

public abstract class Animal implements Swimable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("name: %s", this.name);
    }
}
