import java.util.Hashtable;

public class FirstNonRepeatingCharInString {

    public static void main(String[] args) {
        Hashtable<Character,Integer> stringCharactersCount = new Hashtable<>();
        String testString = "supercalifragilisticexpialidocious";

        for (int i =0; i < testString.length();i++ ){
            char c = testString.charAt(i);
            if (stringCharactersCount.containsKey(c)){
                stringCharactersCount.replace(c, stringCharactersCount.get(c)+1);
            } else {
                stringCharactersCount.put(c,1);
            }
        }

        int i=0;
        while (stringCharactersCount.get(testString.charAt(i)) > 1){
            i++;
        }
        System.out.println("The first unique letter is : "+testString.charAt(i));

    }

}
