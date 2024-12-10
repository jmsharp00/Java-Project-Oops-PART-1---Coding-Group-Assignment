package EsatJavaProject;

public class E1 {
    public static void main(String[] args) {

        String line1 = "Hi";
        String line2 = "Java";


        System.out.println("Before Swap:");
        System.out.println("line1: " + line1);
        System.out.println("line2: " + line2);


        line1 = line1 + line2;
        line2 = line1.substring(0, line1.length() - line2.length());
        line1 = line1.substring(line2.length());

        System.out.println();
        System.out.println("After Swap:");
        System.out.println("line1: " + line1);
        System.out.println("line2: " + line2);
    }
}
