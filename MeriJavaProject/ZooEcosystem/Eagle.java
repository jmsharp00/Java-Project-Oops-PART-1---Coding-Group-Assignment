package ZooEcosystem;

public class Eagle extends Bird{
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
