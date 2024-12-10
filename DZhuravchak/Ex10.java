package Part1;

import java.util.ArrayList;
import java.util.HashSet;

//How can you remove all duplicates from ArrayList?
public class Ex10 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("sun");
        str.add("moon");
        str.add("cloud");
        str.add("sun");
        str.add("rain");

        System.out.println("Original string : "+str);

        HashSet<String> updated = new HashSet<>(str);
        System.out.println("Without duplicates: "+updated);
    }
}
