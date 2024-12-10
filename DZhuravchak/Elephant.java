package zooEcoSystem;

class Elephant extends Mammal{
    public Elephant(String name, int age, String color){
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println("Elephant eats plants");
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant honks");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    void displayInformation() {
        System.out.println("Elephant: "+name+" age: "+age+" color: "+color);
    }
}
