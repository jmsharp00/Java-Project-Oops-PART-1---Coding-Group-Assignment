package EsatJavaProject;

public class E3 {

    public static String reverse(String strng ){

        StringBuilder reversed = new StringBuilder(strng);

        return reversed.reverse().toString();
    }

    public static void main(String[] args) {

        String i="Hello Java";
        String o=reverse(i);

        System.out.println("Orijinal string: "+i);
        System.out.println("Reversed string: "+o);

    }

}

