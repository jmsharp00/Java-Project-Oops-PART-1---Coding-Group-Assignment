public class Question3 {
    // Function to reverse a string
    public static String reverse(String str) {
        String reversed = ""; // Initialize an empty string to store the reversed string

        // Iterate over the string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // Append each character to the reversed string
        }

        return reversed; // Return the reversed string
    }

    public static void main(String[] args) {
        String input = "Hello"; // Example input
        String result = reverse(input); // Call the reverse function

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + result);
    }
}
