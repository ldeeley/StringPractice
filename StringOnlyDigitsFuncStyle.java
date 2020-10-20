import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StringOnlyDigitsFuncStyle {

    public static void main(String[] args) {

        String testString = "9999999999993x9482398423827";
        if (testString.matches("[0-9]*")){
            System.out.println("only digits found");
        } else System.out.println("at least one non-digit found");

    }

}
