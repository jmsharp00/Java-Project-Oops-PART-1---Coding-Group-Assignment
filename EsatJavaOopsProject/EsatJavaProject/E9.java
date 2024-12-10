package EsatJavaProject;

import java.util.LinkedHashMap;
import java.util.Map;

public class E9 {
    public static void main(String[] args) {

        String str = "abracadabra";
        System.out.println("The first non-repeating character is: " + firstNonRepeating(str));
    }

    public static char firstNonRepeating(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();


        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }


        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }


        return '\0';
    }
}
