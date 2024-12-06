package org.example;

abstract class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public abstract void eat();   // Specific eat behavior for birds

    @Override
    public abstract void makeSound();  // Specific sound for birds

    @Override
    public void displayInformation() {
        System.out.println("Bird: " + name + ", Age: " + age);
    }
}