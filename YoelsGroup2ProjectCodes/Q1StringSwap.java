package org.example;

public class Q1StringSwap {
    public static void main(String[] args) {

        String str2 = "Hello";
        String str4 = "world";

        System.out.println("pre swap:");
        System.out.println("str2: " + str2);
        System.out.println("str4: " + str4);


        str2 = str2 + str4;
        str4 = str2.substring(0, str2.length() - str4.length());
        str2 = str2.substring(str4.length());

        System.out.println("\npost swap:");
        System.out.println("str2: " + str2);
        System.out.println("str4: " + str4);


    }
}
