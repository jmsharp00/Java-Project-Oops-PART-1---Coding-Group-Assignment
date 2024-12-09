package org.example;

public class Q3StringReverse {

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();

    }

    public static void main(String[] args) {
        System.out.println(reverse("Greetings"));

    }
}
