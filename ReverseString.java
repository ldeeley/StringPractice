public class ReverseString {

    public static void main(String[] args) {
        String testString = "ABCDE";
        System.out.println(reverseStr(testString));
    }

    public static String  reverseStr(String testString){
        if (testString.length() < 2){
            return testString;
        } else return reverseStr(testString.substring(1))+testString.charAt(0);
    }

}
