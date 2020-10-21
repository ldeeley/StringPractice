import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Predicate;

public class CountingVowelsAndConsonantsFunctionalStyle {

    public static void main(String[] args) throws IOException {
        String lifeOnMarsString = Files.readString(Path.of("lifeonmars.txt"));
        lifeOnMarsString = lifeOnMarsString.toLowerCase();

        long vowelCount = lifeOnMarsString.chars()
                .mapToObj(c->(char) c)
                .filter(character -> {
                    String characterString = character+"";
                    return characterString.matches("[aeiou]");
                })
                .count();

        long consonantCount = lifeOnMarsString.chars()
                .mapToObj(c->(char) c)
                .filter(character -> {
                    String characterString = character+"";
                    return characterString.matches("[a-z-[^aeiou]]");
                })
                .count();
        System.out.println(consonantCount);
        System.out.println(vowelCount);


    }

}
