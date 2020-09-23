public class StringToInt {
//no API
    public static void main(String[] args) {
        String stringNumber = "1234567";

        char[] ch = stringNumber.toCharArray();
        int sum = 0;
        //get ascii value for zero
        int zeroAscii = '0';
        for (char c : ch) {
            sum = (sum * 10) + ((int) c - zeroAscii);
        }
        System.out.println(sum);
    }
}
