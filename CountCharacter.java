import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class CountCharacter {

    public static void main(String[] args) throws IOException {

        String lifeOnMarsString = Files.readString(Path.of("lifeonmars.txt"));

        long characterCount = lifeOnMarsString.chars()
                        .filter(c-> c=='e')
                        .count();

        System.out.println(characterCount);


    }

}
