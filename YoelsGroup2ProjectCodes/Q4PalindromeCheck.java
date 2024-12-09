package org.example;

public class Q4PalindromeCheck {
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Lakers"));
    }

}
