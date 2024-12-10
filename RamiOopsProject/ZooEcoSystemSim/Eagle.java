package org.RamiOopsProject.ZooEcoSystemSim;

public class Eagle extends Bird {
    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle screeches");
    }
}
