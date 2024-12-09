package org.example;

public class Q7WordCount {
    public static int countWords(String input) {

        String[] words = input.split("[\\w_]+");
       if (words.length == 1 && words[0].isEmpty()) {
           return 0;
       }

       return words.length;
    }

    public static void main(String[] args) {
        String inputString = "Hello, world!";
        System.out.println("Number of words: " + countWords(inputString));
    }
}
