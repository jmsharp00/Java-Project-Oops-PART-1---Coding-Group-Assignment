package ZooEcosystem;

class Elephant extends Mammal{
    public Elephant(String name, int age) {
        super(name, age);}

        @Override
        public void eat(){
            System.out.println(name + " the Elephant is eating grass.");
        }

        @Override
        public void makeSound() {
            System.out.println(name + " the Elephant trumpets.");
        }

        @Override
        public void displayInformation() {
            System.out.println("Elephant: " + name + ", Age: " + age);
        }
}

