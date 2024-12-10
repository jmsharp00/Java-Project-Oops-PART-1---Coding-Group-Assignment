import java.util.LinkedHashMap;
import java.util.Map;

public class P9 {
        //Find the First Non-Repeating Character in a String: Given a string, find and return the first non-repeating character. For example, in the string "abracadabra", the first non-repeating character is 'c'.
        public static char findFirstNonRepeatingChar(String str) {
            Map<Character, Integer> charCountMap = new LinkedHashMap<>();

            for (char c : str.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }
            }

            return '\0';
        }

    public static void main(String[] args) {
        String input1 = "abracadabra";
        String input2 = "swiss";
        String input3 = "aabbcc";

        System.out.println("First non-repeating character in \"" + input1 + "\": " + findFirstNonRepeatingChar(input1));
        System.out.println("First non-repeating character in \"" + input2 + "\": " + findFirstNonRepeatingChar(input2));
        System.out.println("First non-repeating character in \"" + input3 + "\": " + findFirstNonRepeatingChar(input3));
    }

}
