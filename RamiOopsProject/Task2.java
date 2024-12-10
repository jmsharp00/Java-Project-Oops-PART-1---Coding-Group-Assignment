package org.RamiOopsProject;

public class Task2 {
    public static void main(String[] args) {

        String str = "Hello123!";

        long count = str.chars().filter(Character::isLetter).count();
        System.out.println("Number of alpha characters: " + count);
    }
}
