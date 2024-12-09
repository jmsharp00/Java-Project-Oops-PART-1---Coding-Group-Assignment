interface AnimalBehavior {
    void eat();
    void sleep();
    void makeSound();
}

abstract class Animal implements AnimalBehavior {
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

abstract class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }
}

abstract class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }
}

class Lion extends Mammal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " the Lion is eating meat.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the Lion roars.");
    }

    @Override
    public void displayInformation() {
        System.out.println("Lion: " + name + ", Age: " + age);
    }
}

class Elephant extends Mammal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " the Elephant is eating grass.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the Elephant trumpets.");
    }

    @Override
    public void displayInformation() {
        System.out.println("Elephant: " + name + ", Age: " + age);
    }
}

class Parrot extends Bird {
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " the Parrot is eating seeds.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the Parrot squawks.");
    }

    @Override
    public void displayInformation() {
        System.out.println("Parrot: " + name + ", Age: " + age);
    }
}

class Eagle extends Bird {
    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " the Eagle is eating fish.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the Eagle screeches.");
    }

    @Override
    public void displayInformation() {
        System.out.println("Eagle: " + name + ", Age: " + age);
    }
}

// Remove the public modifier if you want to keep the file name as ZooEcosystem.java
class ZooSimulation {
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion("Leo", 5),
                new Elephant("Ella", 10),
                new Parrot("Perry", 2),
                new Eagle("Edgard", 4)
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