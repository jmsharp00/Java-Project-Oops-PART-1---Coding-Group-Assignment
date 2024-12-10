package Part1;

import java.util.ArrayList;
import java.util.List;

//You have a list of strings and you want to keep only those that start with “A” and you want to return them in lower case".
public class Ex8 {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("Apple");
        str.add("Mango");
        str.add("Arugula");
        str.add("Watermelon");

        List<String> updated = new ArrayList<>();

        for(String s:str){
            if(s.startsWith("A")){
                updated.add(s.toLowerCase());

            }
        }
        System.out.println(updated);
    }
}
