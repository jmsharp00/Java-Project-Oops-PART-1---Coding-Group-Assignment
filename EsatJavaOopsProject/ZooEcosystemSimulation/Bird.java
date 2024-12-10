package ZooEcosystemSimulation;

public abstract class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    public abstract void eat();

    public abstract void makeSound();

    public void displayInformation(){

        System.out.println("Bird: " + name + ", Age: " + age);

    }
}
