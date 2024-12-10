package org.RamiOopsProject;

import java.util.Arrays;

public class Task5 {

    public static boolean areAnagrams(String str1, String str2){
        char[] arr1 =str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("listen","silent"));
    }
}
