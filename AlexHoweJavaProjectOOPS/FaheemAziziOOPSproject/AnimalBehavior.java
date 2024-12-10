package org.example;

public interface AnimalBehavior {
    void eat();
    void sleep();
    void makeSound();

    class Elephant extends Mammal{
        public Elephant(String name, int age){
            super(name, age);
        }

        public void eat(){
            System.out.println(name + " is eating grass and leaves.");
        }

        public void makeSound(){
            System.out.println(name + " trumpets!");
        }

        public void displayInformation (){
            System.out.println("org.example.AnimalBehavior.Elephant: " + name + ", Age: " + age);
        }
    }

    class Lion extends Mammal{
        public Lion(String name, int age){
            super(name, age);
        }

        public void eat(){
            System.out.println(name + " is hunting for meat.");
        }

        public void makeSound(){
            System.out.println(name + "roars!");
        }

        public void displayInformation(){
            System.out.println("org.example.AnimalBehavior.Lion: " + name + ", Age: " + age);
        }
    }
    abstract class Mammal extends Animal {
        public Mammal(String name, int age){
            super(name, age);
        }

        public abstract void eat();

        public abstract void makeSound();

        public void displayInformation(){
            System.out.println("org.example.AnimalBehavior.Mammal: " + name + ", Age: " + age);
        }
    }

}
