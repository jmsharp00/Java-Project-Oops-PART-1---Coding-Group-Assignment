package org.RamiOopsProject.ZooEcoSystemSim;

public class SimulationTest {

    public static void main(String[] args) {
        Animal[] zooAnimals ={
                new Lion("Leo",5),
                new Elephant("Dumbo",9),
                new Parrot("Polly",2),
                new Eagle("Eddy",4)
        };
        for (Animal animal :zooAnimals){
            animal.displayInformation();
            animal.eat();
            animal.makeSound();
            animal.sleep();
            System.out.println("-------------");
        }
    }
}
