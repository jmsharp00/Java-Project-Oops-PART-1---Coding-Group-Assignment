package org.example;

public class Question4 {
    public static void main(String[] args) {

        boolean isaPalindromeResult = isPalindrome("Hello World");

        if (isaPalindromeResult) {
            System.out.println("\" Hello World\" is palindrome.");
        } else {
            System.out.println("\" Hello World\" is NOT a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        String lowerCase = str.replaceAll("\\s+", "").toLowerCase();
        String reverse = new StringBuilder(lowerCase).reverse().toString();

        return lowerCase.equals(reverse);

    }
}
