package ru.job4j.generics;

public class Tiger extends Predator {
    private int minKgToEat;

    public Tiger(String name, String move, int minKgToEat) {
        super(name, move);
        this.minKgToEat = minKgToEat;

    }

    @Override
    public String toString() {
        return "Tiger{"
                + "minKgToEat=" + minKgToEat
                + '}';
    }
}
