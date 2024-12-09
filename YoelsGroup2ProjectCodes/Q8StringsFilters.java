
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Q8StringsFilters {

    public static List<String> filterAndLowercase(List<String> inputList) {
        return inputList.stream()
                .filter(s -> s.startsWith("A") || s.startsWith("a"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Avocado", "Apricot", "Mango");

        List<String> result = filterAndLowercase(strings);

        System.out.println(result);

    }
}
