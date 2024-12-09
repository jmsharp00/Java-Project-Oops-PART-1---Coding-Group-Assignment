package org.example;

public class Q6CountVowels {

public static int countVowels(String str) {
    int count = 0;
    for (char c : str.toLowerCase().toCharArray()) {
        if ("aeiou".indexOf(c) != -1) {
            count++;
        }
    }
    return count;
}

    public static void main(String[] args) {
        System.out.println(countVowels("documentation"));
    }
}
