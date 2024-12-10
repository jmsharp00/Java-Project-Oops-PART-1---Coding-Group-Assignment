package Part1;

import java.lang.reflect.Array;
import java.util.Arrays;

//Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams,
// meaning they contain the same characters in a different order.
// For example, "listen" and "silent" are anagrams.
public class Ex5 {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";

if(isAnagram(a,b)){
    System.out.println(a+ " "+b+" are Anagrams");
}
else {
    System.out.println(a+" "+b+ " Are not Anagrams");
}

    }
    public static boolean isAnagram(String a, String b){
        if(a.length()!=b.length()){
            return false;
        } else {
            char[] charArray1 = a.toCharArray();
            char[] charArray2 = b.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            return Arrays.equals(charArray1, charArray2);
        }

    }
}
