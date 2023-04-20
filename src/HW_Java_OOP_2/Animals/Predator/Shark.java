package HW_Java_OOP_2.Animals.Predator;

import HW_Java_OOP_2.Interfaces.Swimable;

public class Shark extends Predator implements Swimable {
    private int speedSwim = 20;
    public Shark(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Keep silent";
    }

    @Override
    public int swimSpeed() {
        return this.speedSwim;
    }
}
