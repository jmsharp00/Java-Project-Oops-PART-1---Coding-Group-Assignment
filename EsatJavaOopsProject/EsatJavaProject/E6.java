package EsatJavaProject;

public class E6 {
    public static void main(String[] args) {

        String str = "documentation";

        int vowelCount = countVowels(str);

        System.out.println("The number of vowels in \"" + str + "\" is: " + vowelCount);
    }

    public static int countVowels(String str) {
        int count = 0;

        str = str.toLowerCase();


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);


            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

}



