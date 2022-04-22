package ru.job4j.generics;

public class Predator extends Animal {
    private String name;
    private String move;

    public Predator(String name, String move) {
        super(name);
        this.name = name;
        this.move = move;
    }


    @Override
    public String toString() {
        return "Predator{"
                + "name='" + name + '\''
                + ", move='" + move + '\''
                + '}';
    }
}
