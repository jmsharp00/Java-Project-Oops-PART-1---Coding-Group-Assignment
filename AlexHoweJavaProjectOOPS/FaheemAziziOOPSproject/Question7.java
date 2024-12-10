package org.example;

public class Question7 {
    public static int countWords(String str){

        String[] words = str.split("[\\W_]+");

        return words.length;

    }

    public static void main (String[]args){
        String sentence = "Hello, World!";
        int wordCount = countWords(sentence);

        System.out.println("Number of words: " + countWords(sentence) );

    }
}
