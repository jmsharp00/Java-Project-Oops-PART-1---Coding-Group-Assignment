public class Question2 {
    public static void main(String[] args) {
        String str = "Hello World 123!"; // Example string

        int count = 0; // Variable to store the count of alphabetic characters

        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); // Get the character at index i
            if (Character.isLetter(c)) { // Check if the character is alphabetic
                count++; // Increment the count if it's an alphabetic character
            }
        }

        // Output the result
        System.out.println("Number of alphabetic characters: " + count);
    }

}
