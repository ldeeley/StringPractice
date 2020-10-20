
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Duplicates {

    //display the duplicate characters in a String

    public static void main(String[] args) {

        System.out.println(duplicateCount("indivisibility"));

    }
        public static int duplicateCount(String targetString){
            // Write your code here

            Map<Character, Integer> charCount = new HashMap<>();
            targetString = targetString.toLowerCase();
            for (int i = 0; i < targetString.length(); i++) {
                char ch = targetString.charAt(i);
                if (charCount.containsKey(ch)) {
                    charCount.put(ch, charCount.get(ch) + 1);
                } else charCount.put(ch, 1);
            }

            int duplicateCount = 0;
            for (Map.Entry<Character, Integer> mapElement : charCount.entrySet()) {
                if (mapElement.getValue() >= 2)   duplicateCount++;

            }
            return duplicateCount;
        }
    }

