package EsatJavaProject;

public class E4 {
    public static void main(String[] args) {

        String str = "Madam";

        if(isPalindrome(str)){
            System.out.println(str + " is a palindrome.");
        }else {
            System.out.println(str + " is not a palindrome.");
        }


    }
    public static boolean isPalindrome(String str){

        str = str.toLowerCase();

        String reversed = new StringBuilder(str).reverse().toString();

        return str.equals(reversed);
    }
}
