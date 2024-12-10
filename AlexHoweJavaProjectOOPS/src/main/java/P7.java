public class P7 {
    public static void main(String[] args) {
        //Count the Number of Words in a String: Write a function to count the number of words in a given string. Words are separated by spaces or punctuation. For example, the input "Hello, world!" should return 2.
        String input = "Hello, world!";

        int wordCount = countWords(input);

        System.out.println("The number of words in the string is: " + wordCount);
    }
    public static int countWords(String str) {
        String[] words = str.split("[^a-zA-Z0-9]+");

        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }

        return count;
    }
}
