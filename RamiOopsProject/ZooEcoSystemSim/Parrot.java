package org.RamiOopsProject.ZooEcoSystemSim;

public class Parrot extends Bird {
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Parrot squawks!");
    }
}
