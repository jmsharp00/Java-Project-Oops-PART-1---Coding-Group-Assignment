package zooEcoSystem;

class Parrot extends Bird{
    public Parrot(String name, int age, String color){
        super(name, age, color);
    }
    @Override
    public void eat() {
        System.out.println("Parrot eats sunflower seeds");
    }

    @Override
    public void makeSound() {
        System.out.println("Parrot talkkz");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    void displayInformation() {
        System.out.println("Parrot: "+name+" age: "+age+" color: "+color);
    }
}
