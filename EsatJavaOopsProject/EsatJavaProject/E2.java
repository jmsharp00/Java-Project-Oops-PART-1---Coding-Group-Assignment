package EsatJavaProject;

public class E2 {

    public static int countLetterCharacter(String input){

        int count=0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {

        String input = "Hello, Java! 1515";
        int alphaCount = countLetterCharacter(input);
        System.out.println("Number of alphabetic characters: " + alphaCount);

    }
}
