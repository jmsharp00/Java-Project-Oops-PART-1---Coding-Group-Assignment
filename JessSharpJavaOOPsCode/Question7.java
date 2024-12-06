public class Question7 {
    //Write a function to count the number of words in a given string.
    // Words are separated by spaces or punctuation.
    // For example, the input "Hello, world!" should return 2.
        public static int countWords(String input) {

            String[] words = input.split("[\\W_]+");

            if (words.length == 1 && words[0].isEmpty()) {
                return 0;
            }


            return words.length;
        }

        public static void main(String[] args) {
            String inputString = "Hello, world!";
            System.out.println("Number of words: " + countWords(inputString));
        }
    }

