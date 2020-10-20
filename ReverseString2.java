import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class ReverseString2 {

    public static void main(String[] args) throws IOException {
        String testString= Files.readString(Path.of("lifeonmars.txt"));

        Stream.of(testString)
                        .map(t->t.split(" "))
                        .flatMap(Arrays::stream)
                        .map(ReverseString2::reverseString)
                        .forEach(System.out::println);
    }

    public static String reverseString(String s){
        StringBuilder sbr = new StringBuilder(s);
        return sbr.reverse().toString();
    }

}
