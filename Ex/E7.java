public class E7 {
    public static void main(String[] args) {
       //Count the Number of Words in a String
        String s1="Hello, world!";
        int count=countWords(s1);
        System.out.println("Number of words: "+count);
    }
    public static int countWords(String s1){
       String [] words= s1.split("[\\W_]+");
       return words.length;
    }
}
