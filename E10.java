import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class E10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "grape", "mango", "kiwi", "kiwi", "grape"));

        ArrayList<String> newList= new ArrayList<>(new HashSet<>(list));

        System.out.println(newList);
    }
}
