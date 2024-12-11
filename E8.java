import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E8 {
    public static void main(String[] args) {
        // only keep those that start with “A”
        // and return them in lower case.
            List<String> s1 = Arrays.asList("Anna", "Lisa", "Kate", "Adam", "Liam", "Aisha");

            List<String> updated = s1.stream()
                    .filter(s -> s.startsWith("A"))
                    .map(String::toLowerCase)
                    .collect(Collectors.toList());

            System.out.println(updated);
        }
    }
