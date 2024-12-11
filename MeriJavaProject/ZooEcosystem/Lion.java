package ZooEcosystem;

 class Lion extends Mammal{
     public Lion(String name, int age) {
         super(name, age);
     }
     @Override
     public void eat() {
         System.out.println(name + " the Lion is eating meat.");
     }

     @Override
     public void makeSound() {
         System.out.println(name + " the Lion roars.");
     }

     @Override
     public void displayInformation() {
         System.out.println("Lion: " + name + ", Age: " + age);
     }


}
