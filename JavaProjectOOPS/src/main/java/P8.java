import java.util.List;
import java.util.stream.Collectors;

public class P8 {
    public static List<String> filterAndConvert(List<String> strings) {
        return strings.stream()
                .filter(s -> s.startsWith("A"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> input = List.of("Apple", "Banana", "Apricot", "Grapes", "Avocado", "Mango", "Aloe");

        List<String> result = filterAndConvert(input);
        
        System.out.println("Filtered Strings: " + result);
    }
}
