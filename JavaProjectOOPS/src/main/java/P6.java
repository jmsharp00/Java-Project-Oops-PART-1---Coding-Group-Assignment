public class P6 {
    public static void main(String[] args) {
        //Create a method to count how many vowels are present in a string “documentation”
        String input = "documentation";

        int vowelCount = countVowels(input);

        System.out.println("The number of vowels in \"" + input + "\" is: " + vowelCount);

    }

    public static int countVowels(String str) {
        str = str.toLowerCase();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}
