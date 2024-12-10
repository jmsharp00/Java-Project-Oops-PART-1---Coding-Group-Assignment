package org.example;

public class Question1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before Swap:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        str1 = str1 + str2;
        str2= str1.substring(0,5);
        str1 = str1.substring(str2.length());

        System.out.println("***********");
        System.out.println("After Swap:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);


    }
}
