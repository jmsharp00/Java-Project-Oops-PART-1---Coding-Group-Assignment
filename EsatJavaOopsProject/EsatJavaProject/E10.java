package EsatJavaProject;

import java.util.ArrayList;
import java.util.TreeSet;

public class E10 {

    public static ArrayList<Integer> removeDublicatesNumbers(ArrayList<Integer>list){

        TreeSet<Integer> set=new TreeSet<>(list);

        return new ArrayList<>(set);

    }
    public static void main(String[] args) {

        ArrayList<Integer>mynumbers=new ArrayList<>();
        mynumbers.add(10);
        mynumbers.add(20);
        mynumbers.add(30);
        mynumbers.add(10);
        mynumbers.add(50);
        mynumbers.add(40);
        mynumbers.add(20);

        System.out.println("Orijinal list: "+ mynumbers);

        ArrayList<Integer>newNumbers=removeDublicatesNumbers(mynumbers);

        System.out.println("List after removing duplicates: "+newNumbers);


    }
}
