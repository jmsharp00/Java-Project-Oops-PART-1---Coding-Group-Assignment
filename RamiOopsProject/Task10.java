package org.RamiOopsProject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task10 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Apple","Banana","Apple","Cherry"));
        List<String> uniqueList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList);
    }
}
