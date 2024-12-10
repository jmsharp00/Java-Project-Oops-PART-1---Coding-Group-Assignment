package org.RamiOopsProject;

public class Task4 {

    public static boolean isPalindrome(String str){
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }
}
