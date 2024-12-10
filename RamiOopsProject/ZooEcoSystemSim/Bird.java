package org.RamiOopsProject.ZooEcoSystemSim;

public class Bird extends Animal {

    public Bird(String name, int age){
        super(name,age);
    }
    @Override
    public void eat(){
        System.out.println(getClass().getSimpleName()+ " is eating seeds or insects");
    }
    @Override
    public void makeSound(){
        System.out.println(getClass().getSimpleName()+ " is chirping or singing");
    }

    @Override
    public void displayInformation() {
        System.out.println("Bird: " +getClass().getSimpleName());
    }
}
