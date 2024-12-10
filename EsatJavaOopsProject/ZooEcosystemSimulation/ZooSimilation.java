package ZooEcosystemSimulation;

public class ZooSimilation {
    public static void main(String[] args) {


        Animal Tiger = new AnimalBehavior.Tiger("Rajah", 7);
        Animal Bear = new AnimalBehavior.Bear("Kodiak", 10);
        Animal Zebra= new AnimalBehavior.Zebra("Zara",12);
        Animal Owl = new Owl("Ollie", 5);
        Animal Flamingo = new Flamingo("Flicker", 20);

        Tiger.displayInformation();
        Tiger.eat();
        Tiger.makeSound();
        Tiger.sleep();

        System.out.println();
        
        Bear.displayInformation();
        Bear.eat();
        Bear.makeSound();
        Bear.sleep();

        System.out.println();

        Zebra.displayInformation();
        Zebra.eat();
        Zebra.makeSound();
        Zebra.sleep();

        System.out.println();

        Owl.displayInformation();
        Owl.eat();
        Owl.makeSound();
        Owl.sleep();

        System.out.println();

        Flamingo.displayInformation();
        Flamingo.eat();
        Flamingo.makeSound();
        Flamingo.sleep();

    }
}
