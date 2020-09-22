public class ReverseString {

    public static void main(String[] args) {
        String testString = "ABCDE";
        System.out.println(reverseStr(testString));
    }

    public static String reverseStr(String testString){

        if (testString.length()==1){
            return testString.substring(1)+testString.substring(0,1);
        } else {
            testString = reverseStr(testString.substring(1))+testString.substring(0,1);
            return testString;
        }
    }

}
