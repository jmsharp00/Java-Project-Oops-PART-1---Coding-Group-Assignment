package org.RamiOopsProject.ZooEcoSystemSim;

public class Lion extends Mammal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Lion roars!");
    }

    }
