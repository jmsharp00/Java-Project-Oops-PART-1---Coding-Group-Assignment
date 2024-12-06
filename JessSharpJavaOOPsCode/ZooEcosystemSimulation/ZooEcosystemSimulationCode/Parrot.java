package org.example;

public class Parrot extends Bird{
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating seeds and fruits.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " squawks!");
    }

    @Override
    public void displayInformation() {
        System.out.println("Parrot: " + name + ", Age: " + age);
    }
}
