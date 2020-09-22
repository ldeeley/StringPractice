public class StringOnlyDigits {

    public static void main(String[] args) {
        String test = "1919191a91919";
        System.out.println(test.matches("[0-9]*"));
    }

}
