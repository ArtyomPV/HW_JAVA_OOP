package HW_Java_OOP_2.Animals.Predator;

import HW_Java_OOP_2.Interfaces.Swimable;

public class Whale extends Predator implements Swimable {
    private int speedSwim = 10;
    public Whale(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "UltraLowSound";
    }

    @Override
    public int swimSpeed() {
        return this.speedSwim;
    }
}
