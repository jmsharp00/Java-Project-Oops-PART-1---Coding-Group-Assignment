import java.util.List;
import java.util.stream.Collectors;

public class Question8 {
    //You have a list of strings and you want to keep only those that start with “A”
    // and you want to return them in lower case".
    public static List<String> filterAndLowercase(List<String> inputList) {
        return inputList.stream()
                // Filter strings that start with 'A' (case insensitive)
                .filter(s -> s.startsWith("A") || s.startsWith("a"))
                // Convert each string to lowercase
                .map(String::toLowerCase)
                // Collect the results into a new list
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Sample list of strings
        List<String> strings = List.of("Apple", "Banana", "Avocado", "grape", "Apricot", "Orange");

        // Filter and convert to lowercase
        List<String> result = filterAndLowercase(strings);

        // Output the result
        System.out.println(result);  // Output: [apple, avocado, apricot]
    }
}
