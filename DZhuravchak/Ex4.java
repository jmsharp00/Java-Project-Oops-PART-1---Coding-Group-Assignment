package Part1;
//Check if a String is Palindrome: Determine whether a given string is a palindrome,
// which means it reads the same forwards and backward. For example, "madam" is a palindrome.
public class Ex4 {

    public static void main(String[] args) {

        String str = "river";

        if(isPalindrome(str)){
            System.out.println(str+" Is Palindrome");
        } else {
            System.out.println(str+" Is not Palindrome");
        }

    }
    public static boolean isPalindrome(String str){
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);

        }
    }


