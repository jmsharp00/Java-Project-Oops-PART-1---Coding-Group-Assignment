public class P4 {
    public static void main(String[] args) {
        //Check if a String is Palindrome: Determine whether a given string is a palindrome, which means it reads the same forwards and backward. For example, "madam" is a palindrome.
        String input = "madam";

        boolean isPalindrome = isPalindrome(input);

        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();


        int left = 0;
        int right = str.length() - 1;


        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
