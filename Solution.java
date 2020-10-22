
import java.util.Optional;
import java.util.regex.Pattern;

public class Solution {

    public static int solve(String s) {

        Pattern p = Pattern.compile("[^\\d+]");
        //      String outputString=s.replaceAll("[^\\d]+"," ");
        Optional<Integer> x = p.splitAsStream(s)
                .filter(str -> !str.isEmpty())
                .map(Integer::parseInt)
                .max(Integer::compareTo);
        return x.orElse(-1);
    }

    public static void main(String[] args) {
        System.out.println(solve("gh12cdy695m1"));
    }
}
