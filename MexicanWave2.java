import java.util.stream.IntStream;

public class MexicanWave2 {

    public static String mexican = "two words";
    public static String[] result = new String[mexican.length()];

        public static String[] wave(String str) {
            return IntStream
                    .range(0, str.length())
                    .mapToObj(x -> new StringBuilder(str).replace(x, x+1, String.valueOf(str.charAt(x)).toUpperCase()).toString())
                    .filter(x -> !x.equals(str))
                    .toArray(String[]::new);
        }



    public static void main(String[] args) {

        result=wave(mexican);
        System.out.println("wait here");
    }
}
