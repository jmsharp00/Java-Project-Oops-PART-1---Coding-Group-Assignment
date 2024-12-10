package org.RamiOopsProject;

public class Task6 {

    public static int countVowels(String str){
        return (int) str.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) !=-1)
                .count();
    }

    public static void main(String[] args) {
        System.out.println(countVowels("documentation"));
    }
}
