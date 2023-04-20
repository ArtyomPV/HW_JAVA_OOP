package HW_Java_OOP_2.Task2.Animal.ReptileAnimal;

import HW_Java_OOP_2.Task2.Interfaces.Creepable;
import HW_Java_OOP_2.Task2.Interfaces.Jumpable;

public class Frog extends ReptileAnimal implements Jumpable, Creepable {
    private int speedSwiming = 5;
    private int speedCreeping = 1;
    double length;
    double height;
    public Frog(String name, double length, double height) {
        super(name);
        this.height = height;
        this.length = length;
    }
    public Frog(String name) {
        this(name, 0.4, 0.2);
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " speedSwiming: %d, speedCreeping: %d, jump`s height %s", swim(), creep(), getHeight());
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int jump(double length, double heigth) {
        return 0;
    }


    public double jump() {
        return this.jump(0.40, 0.20);
    }


    @Override
    public int swim() {
        return this.speedSwiming;
    }

    @Override
    public int creep() {
        return this.speedCreeping;
    }
}
