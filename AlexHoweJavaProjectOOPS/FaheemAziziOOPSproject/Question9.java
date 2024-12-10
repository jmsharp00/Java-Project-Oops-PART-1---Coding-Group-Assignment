package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class Question9 {
    public static void main(String[] args) {
        String word ="abracadabra";

        char result = NonRepeatingCharaceter(word);

        if (result != 0){
            System.out.println("The first non-repeating character is: " + result);
        }else{
            System.out.println("There is no non-repeating character.");
        }
    }

    public static char NonRepeatingCharaceter(String str){
        Map<Character, Integer>charCount = new LinkedHashMap<>();

        for(char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0 + 1));
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
            
        }

        return 0;

    }
}
