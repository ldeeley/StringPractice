import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StringOnlyDigitsFuncStyle {

    public static void main(String[] args) {

        String testString = "9999999999993x9482398423827";
        Boolean result = testString.chars().anyMatch(Character::isDigit);

    }

}
