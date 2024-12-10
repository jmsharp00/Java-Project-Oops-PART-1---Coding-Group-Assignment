package zooEcoSystem;

public class ZooTester {
    public static void main(String[] args) {
        Animal lion = new Lion("Leo",5,"brown");
        Animal elephant = new Elephant("Bobo",47,"grey");
        Animal eagle = new Eagle("Enrique",23,"golden");
        Animal parrot = new Parrot("Dodo",13,"green");

        Animal[] animals={lion, elephant,eagle,parrot};

        for(Animal a:animals){
            a.eat();
            a.makeSound();
            a.sleep();
            a.displayInformation();
            System.out.println();
        }
    }
}
