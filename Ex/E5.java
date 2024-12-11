import java.lang.reflect.Array;
import java.util.Arrays;

public class E5 {
    public static void main(String[] args) {
        //Check if Two Strings are Anagrams
        String s1="listen";
        String s2="silent";

        if(isAnagram(s1, s2)){
            System.out.println(s1+ " and "+s2+": are anagrams");
        }else{
            System.out.println(s1+ " and "+s2+": are not anagrams");
        }
    }
    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
           return false;
        }
        char[] arr1=s1.toCharArray();
        char [] arr2=s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
