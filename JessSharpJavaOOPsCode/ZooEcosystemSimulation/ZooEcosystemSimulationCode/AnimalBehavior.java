package org.example;

public interface AnimalBehavior {
    void eat();
    void sleep();
    void makeSound();

    class Elephant extends Mammal {
        public Elephant(String name, int age) {
            super(name, age);
        }

        @Override
        public void eat() {
            System.out.println(name + " is eating grass and leaves.");
        }

        @Override
        public void makeSound() {
            System.out.println(name + " trumpets!");
        }

        @Override
        public void displayInformation() {
            System.out.println("org.example.AnimalBehavior.Elephant: " + name + ", Age: " + age);
        }
    }

    class Lion extends Mammal {
        public Lion(String name, int age) {
            super(name, age);
        }

        @Override
        public void eat() {
            System.out.println(name + " is hunting for meat.");
        }

        @Override
        public void makeSound() {
            System.out.println(name + " roars!");
        }

        @Override
        public void displayInformation() {
            System.out.println("org.example.AnimalBehavior.Lion: " + name + ", Age: " + age);
        }
    }

    abstract class Mammal extends Animal {
        public Mammal(String name, int age) {
            super(name, age);
        }

        @Override
        public abstract void eat();   // Specific eat behavior for mammals

        @Override
        public abstract void makeSound();  // Specific sound for mammals

        @Override
        public void displayInformation() {
            System.out.println("org.example.AnimalBehavior.Mammal: " + name + ", Age: " + age);
        }
    }
}
