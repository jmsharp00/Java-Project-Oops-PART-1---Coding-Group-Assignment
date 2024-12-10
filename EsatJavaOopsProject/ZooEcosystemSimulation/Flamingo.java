package ZooEcosystemSimulation;

public class Flamingo extends Bird{

    public Flamingo(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println(name + " is eating microscopic plants and shrimp.");
    }
    @Override
    public void makeSound() {
        System.out.println(name + " grunk and honk!");
    }
    @Override
    public void displayInformation() {
        System.out.println("Flamingo: " + name + ", Age: " + age);
    }
}
