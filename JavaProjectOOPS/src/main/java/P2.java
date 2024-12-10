public class P2 {
    public static void main(String[] args) {
        //Find out how many alpha characters are present in a string
        String test = "Dushka Lababa 12345";


        int numbAlpha = 0;


        for (int i = 0; i < test.length(); i++) {
            if (Character.isLetter(test.charAt(i))) {
                numbAlpha++;
            }
        }

        System.out.println("The number of alphabetic characters is: " + numbAlpha);
    }
}
