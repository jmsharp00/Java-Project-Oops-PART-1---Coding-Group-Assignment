package ZooEcosystemSimulation;

public interface AnimalBehavior {

    void eat();
    void sleep();
    void makeSound();


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


    class Tiger extends Mammal {
        public Tiger(String name, int age) {
            super(name, age);
        }
        @Override
        public void eat() {
            System.out.println(name + " is hunting for meat.");
        }
        @Override
        public void makeSound() {
            System.out.println(name + " Chuff or Snary!");
        }
        @Override
        public void displayInformation() {
            System.out.println("Tiger: " + name + ", Age: " + age);
        }
    }


    class Bear extends Mammal {
        public Bear(String name, int age) {
            super(name, age);
        }
        @Override
        public void eat() {
            System.out.println(name + " is eating fish and honey.");
        }
        @Override
        public void makeSound() {
            System.out.println(name + " Huff!");
        }
        @Override
        public void displayInformation() {
            System.out.println("Bear: " + name + ", Age: " + age);
        }
    }


    class Zebra extends Mammal {
        public Zebra(String name, int age) {
            super(name, age);
        }
        @Override
        public void eat() {
            System.out.println(name + " is eating grass.");
        }
        @Override
        public void makeSound() {
            System.out.println(name + " Neighing!");
        }
        @Override
        public void displayInformation() {
            System.out.println("Zebra: " + name + ", Age: " + age);
        }
    }

}
