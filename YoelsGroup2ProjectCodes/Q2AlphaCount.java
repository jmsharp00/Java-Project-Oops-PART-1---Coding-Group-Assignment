package org.example;

public class Q2AlphaCount {

    public static int CountAlpha(String str) {
        int count = 0;
        for (char C: str.toCharArray()) {
            if (Character.isLetter(C)) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(CountAlpha("GoFalcons!"));
    }

}
