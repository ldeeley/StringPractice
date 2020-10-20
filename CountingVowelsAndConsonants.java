import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class CountingVowelsAndConsonants {

    public static void main(String[] args) throws IOException {

        String lifeOnMarsString = Files.readString(Path.of("lifeonmars.txt"));

        char[] lifeOnMarsArray = lifeOnMarsString.toLowerCase().toCharArray();

        int vowelCount=0;
        int consonantCount = 0;
        for (char ch: lifeOnMarsArray){
            String strCh = ch+"";
            if (strCh.matches("[aeiou]")){
                vowelCount++;
            } else if (strCh.matches("[^aeiou]")){
                consonantCount++;
            }
        }
        System.out.println("Vowel count is : "+vowelCount);
        System.out.println("Consonant count is : "+consonantCount);
    }

}
