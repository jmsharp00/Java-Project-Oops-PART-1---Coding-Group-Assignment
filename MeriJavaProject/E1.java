import org.example.Main;

public class E1 {
    public static void main(String[] args) {
        //Swap 2 Strings without temporary variable.

        String s1 = "Hello";
        String s2 = "World";

        System.out.println("Before Swap: s1 = "+ s1+", s2 = "+s2);

        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());

        System.out.println("After Swap: s1 = "+ s1+", s2 = "+s2);

    }
}
