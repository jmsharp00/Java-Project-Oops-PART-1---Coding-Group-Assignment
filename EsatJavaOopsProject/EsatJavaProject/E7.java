package EsatJavaProject;

public class E7 {
    public static void main(String[] args) {

        String str = "Java programming is fun!";

        int wordCount = countWords(str);

        System.out.println("The number of words in the string is: " + wordCount);
    }

    public static int countWords(String str) {

        String[] words = str.trim().split("\\s+");


        return words.length;
    }
}
