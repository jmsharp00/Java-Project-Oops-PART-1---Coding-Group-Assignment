package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Question8 {
    public static List<String>filterAndConvert(List<String>input){
        List<String> result = new ArrayList<>();

        for (String str: input){
            if (str.startsWith("A")){
                result.add(str.toLowerCase());

            }
        }
        return result;

    }

    public static void main(String[] args) {
        List<String> strings = List.of("Amy","Adam", "Frank", "paul", "Allen");

        List<String>filteredStrings = filterAndConvert(strings);

        System.out.println("Filter strings: " + filteredStrings);
    }
}
