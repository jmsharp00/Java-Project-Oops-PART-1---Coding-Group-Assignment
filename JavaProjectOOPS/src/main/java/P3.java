public class P3 {
    public static void main(String[] args) {

        String input = "Hello";


        String reversed = reverse(input);


        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);

    }

    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
