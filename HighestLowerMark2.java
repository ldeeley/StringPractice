import java.util.Arrays;
import java.util.OptionalInt;

public class HighestLowerMark2 {

    public static String highAndLow(String numbers) {

     OptionalInt y = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .min();

        OptionalInt x = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .max();

        return x.orElse(-1)+" "+y.orElse(-1);
    }
    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

}
