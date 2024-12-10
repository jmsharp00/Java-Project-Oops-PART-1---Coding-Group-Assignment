package ZooEcosystemSimulation;

public class Owl extends Bird{

    public Owl(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println(name + " is hunting mouse and fish.");
    }
    @Override
    public void makeSound() {
        System.out.println(name + " hoo-hoo!");
    }
    @Override
    public void displayInformation() {
        System.out.println("Owl: " + name + ", Age: " + age);
    }

}
