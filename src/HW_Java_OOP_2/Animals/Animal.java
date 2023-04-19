package HW_Java_OOP_2.Animals;

import HW_Java_OOP_2.Interfaces.Sayable;

public abstract class Animal implements Sayable {

    private String name;

    public abstract String feed();

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("name: %s, say: %s, feed: %s", name, say(), feed());
    }


    public String getName() {
        return name;
    }
}
