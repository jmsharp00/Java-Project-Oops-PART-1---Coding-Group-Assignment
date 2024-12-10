package org.example;

public class ZooSimulation {
    public static void main(String[] args) {



    Animal lion = new AnimalBehavior.Lion("Simba", 5);
    Animal elephant = new AnimalBehavior.Elephant("Dumbo", 10);
    Animal parrot = new Parrot("Polly", 2);
    Animal eagle = new Eagle ("Eddie", 4);

    lion.displayInformation();
    lion.eat();
    lion.makeSound();
    lion.sleep();

    System.out.println();

    elephant.displayInformation();
    elephant.eat();
    elephant.makeSound();
    elephant.sleep();

    System.out.println();

    parrot.displayInformation();
    parrot.eat();
    parrot.makeSound();
    parrot.sleep();

    System.out.println();

    eagle.displayInformation();
    eagle.eat();
    eagle.makeSound();
    eagle.sleep();


    }




}
