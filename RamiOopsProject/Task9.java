package org.RamiOopsProject;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task9 {

    public static Character findFirstNonRepeating (String str){
        Map<Character,Integer> charCount = new LinkedHashMap<>();
        for (char c :str.toCharArray()){
            charCount.put(c,charCount.getOrDefault(c,0)+1);
        }

        return charCount.entrySet().stream()
                .filter(entry ->entry.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args) {
        System.out.println(findFirstNonRepeating("abracadabra"));
    }
}
