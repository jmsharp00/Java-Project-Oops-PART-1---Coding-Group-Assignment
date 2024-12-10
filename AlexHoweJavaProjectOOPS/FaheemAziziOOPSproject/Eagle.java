package org.example;

class Eagle extends Bird {
    public Eagle(String name, int age){
        super(name, age);
    }

    public void eat (){
        System.out.println(name + " is hunting small animals.");
    }

    public void makeSound(){
        System.out.println(name + "screeches!");
    }

    public void displayInformation(){
        System.out.println("Eagle: " + name + ", Age: " + age);
    }

}
