import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first word : ");
        String firstWord = reader.readLine();
        System.out.print("Enter second word : ");
        String secondWord = reader.readLine();
        if (checkForAnagrams(firstWord,secondWord)) {
            System.out.println(firstWord+" is an anagram of "+secondWord);
        } else
            System.out.println("These are not anagrams");
    }

    public static boolean checkForAnagrams(String firstWord, String secondWord){
        char[] firstWordArray = firstWord.toLowerCase().replaceAll("[^a-z]","").toCharArray();
        char[] secondWordArray = secondWord.toLowerCase().replaceAll("[^a-z]","").toCharArray();
        Arrays.sort(firstWordArray);
        Arrays.sort(secondWordArray);
        System.out.println(Arrays.equals(firstWordArray, secondWordArray));
        return Arrays.equals(firstWordArray, secondWordArray);
    }

}
