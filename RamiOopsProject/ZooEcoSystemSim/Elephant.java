package org.RamiOopsProject.ZooEcoSystemSim;

public class Elephant extends Mammal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant trumpets!");
    }
}