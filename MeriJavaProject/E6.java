public class E6 {
    public static void main(String[] args) {
        // Create a method to count how many vowels are present in a string “documentation”
        String s = "documentation";
        int vowels = VowelCount(s);
        System.out.println("Number os vowels: " + vowels);
    }
        public static int VowelCount(String s){
            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
          return count;
        }
    }
