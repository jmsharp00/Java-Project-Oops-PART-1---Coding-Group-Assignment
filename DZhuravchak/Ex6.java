package Part1;

import java.util.Arrays;
import java.util.List;

//Create a method to count how many vowels are present in a string “documentation”
public class Ex6 {

    public static void main(String[] args) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        String string = "documentation";

        int vowelCount = countVowels(string, vowels);

        System.out.println(string+" contains "+vowelCount+" vowels");
    }
    public static int countVowels(String str, List<Character> vowels) {

        int count = 0;

        for(char c: str.toCharArray()){
            if(vowels.contains(c)){
                count++;
            }
        }
        return count;
    }
    }

