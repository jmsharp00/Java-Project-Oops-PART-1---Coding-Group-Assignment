package org.RamiOopsProject.ZooEcoSystemSim;

public abstract class Animal implements AnimalBehavior{

    private  String name;
    private int age;

    public Animal(String name, int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    public abstract void displayInformation();
}
