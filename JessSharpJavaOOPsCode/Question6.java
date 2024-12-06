public class Question6 {
    //Create a method to count how many vowels are present in a string “documentation”
    public static int countVowels(String str) {
        str = str.toLowerCase();
        int vowelCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    public static void main(String[] args) {
        String input = "documentation";
        int result = countVowels(input);
        System.out.println("Number of vowels in '" + input + "': " + result);
    }
}

