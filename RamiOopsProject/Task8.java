package org.RamiOopsProject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task8 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Avocado", "Cherry");
        List<String> filtered = strings.stream()
                .filter(s -> s.startsWith("A"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(filtered);
    }
}
