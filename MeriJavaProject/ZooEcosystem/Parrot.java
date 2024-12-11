package ZooEcosystem;

public class Parrot extends Bird{
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
