public class StringOnlyDigitsNoAPI {

    public static void main(String[] args) {
        String test = "21312a3123213123";

        boolean digitsOnly = true;
        int i=0;
        while (digitsOnly && i < test.length()){
            if (test.charAt(i) < '0' || test.charAt(i) > '9') digitsOnly=false;
            i++;
        }
        System.out.println(digitsOnly);
    }

}
