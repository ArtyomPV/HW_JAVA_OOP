package HW_Java_OOP_2.Task2.Animal.WaterAnimal;

public class Jellyfish extends WaterAnimal{
    private int speedSwiming = 1;
    public Jellyfish(String name) {
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
