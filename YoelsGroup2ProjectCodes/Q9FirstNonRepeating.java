import java.util.LinkedHashMap;
import java.util.Map;

public class Q9FirstNonRepeating {
    public static Character firstNonRepeatingChar(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char c: str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String input = "abracadabra";
        Character result = firstNonRepeatingChar(input);
        System.out.println(result != null ? result : "no non-repeating character found");
    }
}
