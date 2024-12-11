public class E4 {
    public static void main(String[] args) {
        //Check if a String is Palindrome
        String s="madam";
        System.out.println("String: "+s);
        boolean isPalindrome=s.equals(new StringBuilder(s).reverse().toString());

        System.out.println("Palindrome: "+isPalindrome);
    }
}
