package ZooEcosystem;

public class ZooSimulation {
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion("Leo", 13),
                new Elephant("Billy", 1),
                new Parrot("Peter", 21),
                new Eagle("Power", )
        };

        for (Animal animal : animals) {
            animal.displayInformation();
            animal.eat();
            animal.makeSound();
            animal.sleep();
            System.out.println();
        }


    }
}
