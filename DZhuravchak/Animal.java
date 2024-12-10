package zooEcoSystem;

abstract class Animal implements AnimalBehavior{
protected String name;
protected int age;
protected String color;

public Animal(String name, int age, String color){
    this.name=name;
    this.age=age;
    this.color=color;
}
    @Override
    public void sleep() {
        System.out.println("ZzzZZzzzzz...");
    }
    abstract void displayInformation();
}
