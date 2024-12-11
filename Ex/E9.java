import java.util.LinkedHashMap;
import java.util.Map;

public class E9 {
    public static void main(String[] args) {
        String str = "abracadabra";
        char result=nonRepeating(str);


        if(result != '\0'){
            System.out.println( "First non-repeating character: "+result);
        }else{
            System.out.println("No non repeating characters");
        }
    }
    public static char nonRepeating(String str){
        Map <Character, Integer> charCount=new LinkedHashMap<>();
        for(char ch: str.toCharArray()){
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }

        }

        return 0;
    }
}
