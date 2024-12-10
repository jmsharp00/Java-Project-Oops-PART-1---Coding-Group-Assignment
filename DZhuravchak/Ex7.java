package Part1;
//Count the Number of Words in a String: Write a function to count the number of words in a given string.
// Words are separated by spaces or punctuation. For example, the input "Hello, world!" should return 2.
public class Ex7 {
    public static void main(String[] args) {
        String string = "Hello, Syntax";
        int wordCount = countWords(string);

        System.out.println("Number of words in "+string+" -"+wordCount);




        }

        public static int countWords(String str){
        str = str.trim();
        String[] words = str.split("\\W+");

        return words.length;
        }
    }

