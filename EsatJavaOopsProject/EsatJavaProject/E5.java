package EsatJavaProject;

import java.util.Arrays;

public class E5 {

    public static boolean areAnagrams(String string1, String string2) {

        if (string1.length() != string2.length()) {
            return false;
        }


        char[] strArry1 = string1.toCharArray();
        char[] strArray2 = string2.toCharArray();

        Arrays.sort(strArry1);
        Arrays.sort(strArray2);


        return Arrays.equals(strArry1, strArray2);
    }

    public static void main(String[] args) {
        String string1 = "earth";
        String string2 = "heart";

        System.out.println(areAnagrams(string1,string2));
    }
}
