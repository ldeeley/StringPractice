public class PalindromeChecker {

    public static void main(String[] args) {
        System.out.println(palindromeCheck ("radarxzradar"));
    }

    public static boolean palindromeCheck(String testString){
        char[] testStringArray = testString.toCharArray();

        int checkMax = testString.length() / 2;
        boolean isPalindrome = true;
        int i = 0;
        while (isPalindrome && i <checkMax) {
            if (testStringArray[i] != testStringArray[testStringArray.length-1-i]) {
                isPalindrome = false;
            } else i++;
        }
        return isPalindrome;
    }


}
