package org.RamiOopsProject.ZooEcoSystemSim;

public class Mammal extends Animal {

    public Mammal(String name,int age){
        super(name,age);
    }
    @Override
    public void eat(){
        System.out.println(getClass().getSimpleName()+ " is eating grass or meat");
    }
    @Override
    public void makeSound(){
        System.out.println(getClass().getSimpleName()+ "is making a mammal sound.");
    }
    @Override public void displayInformation(){
        System.out.println("Mammal: "+getClass().getSimpleName());
    }
}
