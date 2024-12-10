package zooEcoSystem;

class Lion extends Mammal {
    public Lion(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println("Lion Eats meat");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion Roars");
    }

    @Override
    public void sleep() {
        System.out.println("ZZzzZ");
    }

    @Override
    void displayInformation() {
        System.out.println("Lion: " + name + " age: " + age + " color: " + color);
    }
}
