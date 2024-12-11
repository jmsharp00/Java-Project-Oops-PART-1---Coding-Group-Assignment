public class E2 {
    public static void main(String[] args) {
    //how many alpha characters are present in a string?

    String str = "Hello World!";
    int count = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                count++;
            }
        }

    System.out.println("Number of alphabetic characters: " + count);
    }

}

