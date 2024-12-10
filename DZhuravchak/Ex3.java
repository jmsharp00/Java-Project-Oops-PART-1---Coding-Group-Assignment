package Part1;

public class Ex3 {
//    Reverse a String: Write a function to reverse a given string. For example, given the input "Hello", the output should be "olleH".

    public  static String reverceStr(String str) {
        StringBuilder s = new StringBuilder(str);

        str = s.reverse().toString();
        return str;
    }

    public static void main(String[] args) {
String string = "Hello";
String reverced = reverceStr(string);
        System.out.println(string);
        System.out.println(reverced);
    }
}
