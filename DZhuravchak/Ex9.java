package Part1;

import java.util.*;

//Find the First Non-Repeating Character in a String: Given a string, find and return the first non-repeating character.
// For example, in the string "abracadabra", the first non-repeating character is 'c'.
public class Ex9 {
    public static void main(String[] args) {
        String str = "abracadabra";
char result = firstNonRepChar(str);
        if (result != 0) {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

    }

    public static char firstNonRepChar(String str){
        int i = 0;

        while ((i<str.length())){
            char current = str.charAt(i);
            boolean isRepeating=false;

            int j =0;

            while ((j<str.length())){
                if(i != j && str.charAt(j)==current){
                    isRepeating=true;
                    break;
                } j++;
            }
            if(!isRepeating){
                return current;
            } i++;
        } return 0;
    }
}
