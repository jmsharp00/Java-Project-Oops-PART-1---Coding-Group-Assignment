package zooEcoSystem;



class Eagle extends Bird{
public Eagle(String name, int age, String color){
    super(name, age, color);
}
    @Override
    public void eat() {
        System.out.println("Eagle eats fish");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle screams");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    void displayInformation() {
        System.out.println("Eagle: "+name+" age: "+age+" color: "+color);
    }
}

