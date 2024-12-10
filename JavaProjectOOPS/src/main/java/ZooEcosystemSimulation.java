import java.util.ArrayList;
import java.util.List;

public class ZooEcosystemSimulation {
    public interface AnimalBehavior {
        void eat();
        void sleep();
        void makeSound();
    }

    public abstract static class Animal implements AnimalBehavior {
        protected String name;
        protected int age;


        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public void sleep() {
            System.out.println(name + " is sleeping.");
        }

        public abstract void displayInformation();
    }

    public abstract static class Mammal extends Animal {
        public Mammal(String name, int age) {
            super(name, age);
        }

        @Override
        public void eat() {
            System.out.println(name + " is eating grass, plants, or meat.");
        }
    }

    public abstract static class Bird extends Animal {
        public Bird(String name, int age) {
            super(name, age);
        }

        @Override
        public void eat() {
            System.out.println(name + " is pecking it's food.");
        }
    }

    public static class Lion extends Mammal {
        public Lion(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " roars loudly!");
        }

        @Override
        public void displayInformation() {
            System.out.println("Lion [Name: " + name + ", Age: " + age + "]");
        }
    }

    public static class Elephant extends Mammal {
        public Elephant(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " trumpets!");
        }

        @Override
        public void displayInformation() {
            System.out.println("Elephant [Name: " + name + ", Age: " + age + "]");
        }
    }

    public static class Parrot extends Bird {
        public Parrot(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " says, 'Hello!'");
        }

        @Override
        public void displayInformation() {
            System.out.println("Parrot [Name: " + name + ", Age: " + age + "]");
        }
    }

    public static class Eagle extends Bird {
        public Eagle(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " screeches!");
        }

        @Override
        public void displayInformation() {
            System.out.println("Eagle [Name: " + name + ", Age: " + age + "]");
        }
    }

    public static void main(String[] args) {
        Animal lion = new Lion("Simba", 5);
        Animal elephant = new Elephant("Dumbo", 10);
        Animal parrot = new Parrot("Polly", 2);
        Animal eagle = new Eagle("Freedom", 4);

        // Add animals to a list
        List<Animal> zoo = new ArrayList<>();
        zoo.add(lion);
        zoo.add(elephant);
        zoo.add(parrot);
        zoo.add(eagle);

        // Display behaviors of each animal
        for (Animal animal : zoo) {
            animal.displayInformation();
            animal.eat();
            animal.sleep();
            animal.makeSound();
            System.out.println(); // Line separator
        }
    }
}
