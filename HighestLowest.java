import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HighestLowest {

        public static String highAndLow(String numbers) {

            Pattern p = Pattern.compile(" +");
            // split the text
            Stream<String> result = p.splitAsStream(numbers);

            List<Integer> intList =result
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            int maxInt = Collections.max(intList);
            int minInt = Collections.min(intList);

            return  maxInt+" "+minInt;
        }

    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    }


