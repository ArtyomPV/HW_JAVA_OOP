package HW_Java_OOP_2.Animals.Predator;

import HW_Java_OOP_2.Interfaces.Flyable;

public class Eagle extends Predator implements Flyable {


    int speedFly = 70;

    public Eagle(String name) {
        super(name);
    }

    @Override
    public int flySpeed() {
        return this.speedFly;
    }

    @Override
    public String toString() {
        return String.format("Eagle " + super.toString());
    }

    @Override
    public String say() {
        return "Летают молча";
    }
}
