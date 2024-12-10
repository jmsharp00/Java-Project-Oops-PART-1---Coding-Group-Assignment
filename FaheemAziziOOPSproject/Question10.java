package org.example;

import java.util.ArrayList;
import java.util.HashSet;

public class Question10 {
    public static ArrayList<String> removeDuplicates(ArrayList<String> list){

        HashSet<String> set = new HashSet<>(list);

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");

        System.out.println("Before removing duplicates: " + list);
        list = removeDuplicates(list);
        System.out.println("After removing duplicates: " + list);
    }
}
