import java.util.HashMap;
import java.util.Map;

public class Question9 {
    //Find the First Non-Repeating Character in a String:
    // Given a string, find and return the first non-repeating character.
    // For example, in the string "abracadabra", the first non-repeating character is 'c'.
    public static Character findFirstNonRepeatingCharacter(String input) {

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }


        for (char c : input.toCharArray()) {
            if (frequencyMap.get(c) == 1) {
                return c;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String input = "abracadabra";
        Character result = findFirstNonRepeatingCharacter(input);

        if (result != null) {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
