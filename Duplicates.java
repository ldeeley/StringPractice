
import java.util.HashMap;
import java.util.Map;

public class Duplicates {

    //display the duplicate characters in a String

    public static void main(String[] args) {
        String targetString = args[0];

        HashMap<Character,Integer> charCount = new HashMap<>();

        for (int i = 0; i < targetString.length(); i++){
            char ch = targetString.charAt(i);
            if (charCount.containsKey(ch)){
                charCount.put(ch,charCount.get(ch)+1);
            } else charCount.put(ch,1);
        }

        for (Map.Entry<Character, Integer> mapElement : charCount.entrySet()) {
            if (mapElement.getValue() == 2) System.out.println(mapElement.getKey());
        }


    }

}
