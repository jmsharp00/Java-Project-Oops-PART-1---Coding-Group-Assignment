package org.example;

public class Parrot extends Bird {
    public Parrot(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + " is eating seeds and fruits.");
    }

    public void makeSound() {
        System.out.println(name + " Beeb!");
    }


    public void displayInformation() {
        System.out.println("Parrot: " + name + ", Age: " + age);
    }
}
