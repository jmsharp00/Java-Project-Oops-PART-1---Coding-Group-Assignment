import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class P10 {
        //How can you remove all duplicates from ArrayList?
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("apple");
            list.add("banana");
            list.add("apple");
            list.add("orange");
            list.add("banana");

            System.out.println("Original List: " + list);

            Set<String> set = new LinkedHashSet<>(list);
            List<String> uniqueList = new ArrayList<>(set);

            System.out.println("List without duplicates: "+uniqueList);
        }
}
