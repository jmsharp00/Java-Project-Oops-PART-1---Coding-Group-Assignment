package org.example;

import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
        public static boolean isAnagram (String str1, String str2){
            if(str1.length() != str2.length()){
                return false;
            }

            char [] Array1 = str1.toCharArray();
            char [] Array2 = str2.toCharArray();

            Arrays.sort(Array1);
            Arrays.sort(Array2);

            return Arrays.equals(Array1, Array2);
        }
    }

