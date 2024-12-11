package ZooEcosystem;

abstract class Animal implements AnimalBehavior{
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
