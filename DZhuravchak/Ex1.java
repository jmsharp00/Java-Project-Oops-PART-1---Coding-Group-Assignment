package Part1;

public class Ex1 {
    public static void main(String[] args) {
//        Write a program to swap 2 String without a temporary variable?

        String a = "Hello";
        String b = "Syntax";
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println(a+ " "+b);
    }
}