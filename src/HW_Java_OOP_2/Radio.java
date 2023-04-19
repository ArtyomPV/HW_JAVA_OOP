package HW_Java_OOP_2;

import HW_Java_OOP_2.Interfaces.Sayable;

public class Radio implements Sayable {
    private String name;

    public Radio(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Radio %s", name);
    }


    @Override
    public String say() {
        return "Bla-bla-bla";
    }
}
