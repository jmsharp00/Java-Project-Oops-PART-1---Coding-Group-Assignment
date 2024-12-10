package org.example;

public class Question6 {
    public static void main(String[] args) {
        String doc = "documentation";
        int vowels = VowelCount(doc);

        System.out.println("The number of vowels in : " + doc + " is " + vowels );

    }
    public static int VowelCount(String str){
        int vowelCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){

                vowelCount++;
            
        }
            
        }
        return vowelCount;
    }
}
