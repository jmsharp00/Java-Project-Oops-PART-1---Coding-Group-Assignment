package org.example;

class Eagle extends Bird {
    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " is hunting small animals.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " screeches!");
    }

    @Override
    public void displayInformation() {
        System.out.println("Eagle: " + name + ", Age: " + age);
    }
}
