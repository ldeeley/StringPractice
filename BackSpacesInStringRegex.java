import java.util.Stack;

public class BackSpacesInStringRegex {

    public static String cleanString(String s) {
            while (s.matches(".*[^#]#.*")) {
                s = s.replaceAll("[^#]#","");
            }
        return s.replaceAll("#","");
    }

    public static void main(String[] args) {
        System.out.println(cleanString("abc#d##c"));
    }
}
