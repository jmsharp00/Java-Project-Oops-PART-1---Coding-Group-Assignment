public class Question1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Display original strings
        System.out.println("Before Swap:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // Swap the strings without using a temporary variable
        str1 = str1 + str2;  // Concatenate both strings
        str2 = str1.substring(0, str1.length() - str2.length()); // Extract the first string
        str1 = str1.substring(str2.length());  // Extract the second string

        // Display swapped strings
        System.out.println("\nAfter Swap:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }

}
