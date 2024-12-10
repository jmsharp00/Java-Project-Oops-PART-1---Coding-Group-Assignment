package EsatJavaProject;

import java.util.ArrayList;

public class E8 {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Elephant");
        animals.add("Antelope");
        animals.add("Alligator");
        animals.add("Cat");
        animals.add("Albatross");
        animals.add("Dog");

        ArrayList<String> filteredAnimals = new ArrayList<>();

        for (String animal1:animals) {

            if (animal1.startsWith("A")) {
                filteredAnimals.add(animal1.toLowerCase());
            }
        }

        System.out.println(filteredAnimals);

    }
}
