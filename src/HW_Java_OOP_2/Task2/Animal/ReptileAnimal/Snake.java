package HW_Java_OOP_2.Task2.Animal.ReptileAnimal;

import HW_Java_OOP_2.Task2.Interfaces.Creepable;
import HW_Java_OOP_2.Task2.Interfaces.Swimable;

public class Snake extends ReptileAnimal implements Creepable, Swimable {

    private int speedCreeping = 10;
    private int speedSwiming = 10;
    public Snake(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " speedSwiming: %d, speedCreeping: %d", swim(), creep() );
    }
    @Override
    public int creep() {
        return this.speedCreeping;
    }

    @Override
    public int swim() {
        return this.speedSwiming;
    }
}
