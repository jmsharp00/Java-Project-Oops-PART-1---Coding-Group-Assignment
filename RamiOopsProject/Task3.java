package org.RamiOopsProject;

public class Task3 {
    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
    }

}
