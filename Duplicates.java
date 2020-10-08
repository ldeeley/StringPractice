import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Duplicates {

    //count the number of duplicates in a String

    public static void main(String[] args) {
        String targetString = args[0];

        char[] targetArray = targetString.toCharArray();
        Arrays.sort(targetArray);

        HashMap<Character,Integer> charCount = new HashMap<>();

        for (char ch : targetArray){
            if (charCount.containsKey(ch)){
                int count = charCount.get(ch);
                count++;
                charCount.put(ch,count);
            } else charCount.put(ch,1);
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : charCount.entrySet()) {
            Map.Entry<Character,Integer> mapElement = (Map.Entry) characterIntegerEntry;
            if ((int) mapElement.getValue() == 2) System.out.println(mapElement.getKey());
        }

        
    }

}
