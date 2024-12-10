package Part1;

public class Ex2 {
//    Find out how many alpha characters are present in a string?

    public static void main(String[] args) {
        String str = "November 27";

        int alphachar = 0;

        for(char c:str.toCharArray()){
            if(Character.isAlphabetic(c)){
                alphachar++;
            }
        }
        System.out.println(alphachar);
    }



}
