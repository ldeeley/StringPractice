
import java.util.HashMap;
import java.util.Map;

public class Duplicates {

    //count the number of duplicates in a String

    public static void main(String[] args) {
        String targetString = args[0];

        //char[] targetArray = targetString.toCharArray();
        //Arrays.sort(targetArray);

        HashMap<Character,Integer> charCount = new HashMap<>();

        for (int i = 0; i < targetString.length(); i++){
            char ch = targetString.charAt(i);
            if (charCount.containsKey(ch)){
                int count = charCount.get(ch);
                count++;
                charCount.put(ch,count);
            } else charCount.put(ch,1);
        }

        for (Map.Entry<Character, Integer> mapElement : charCount.entrySet()) {
            if (mapElement.getValue() == 2) System.out.println(mapElement.getKey());
        }


    }

}
