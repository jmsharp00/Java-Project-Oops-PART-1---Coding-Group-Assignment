import java.util.ArrayList;
import java.util.HashSet;

public class Q10RemovingDuplicates {

    public static ArrayList<String> removeDuplicates(ArrayList<String> list) {
        HashSet<String> set = new HashSet<>(list);

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Lakers");
        list.add("Hawks");
        list.add("Lakers");
        list.add("Spurs");
        list.add("Hawks");

        System.out.println("Before removing duplicates: " + list);
        list = removeDuplicates(list);
        System.out.println("After removing duplicates: " + list);

    }
}
