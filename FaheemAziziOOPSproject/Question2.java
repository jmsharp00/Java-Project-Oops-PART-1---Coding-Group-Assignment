package org.example;

public class Question2 {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;

        for(char c : str.toCharArray()){
            if(Character.isLetter(c)){
                count++;
            }

        }
        System.out.println("The number of alphabetic characters: " + count);
    }
}
