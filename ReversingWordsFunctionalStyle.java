import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReversingWordsFunctionalStyle {

    public static void main(String[] args) {

        //String lifeOnMarsString = Files.readString(Path.of("lifeonmars.txt"));
        String lifeOnMarsString = "It's a God awful small affair";

        Pattern p = Pattern.compile(" +");
        // split the text
        String result = p.splitAsStream(lifeOnMarsString)
                    .map(w->new StringBuilder(w).reverse())
                    .collect(Collectors.joining(" "));

        System.out.println(result);



    }

}
