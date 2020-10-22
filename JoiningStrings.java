public class JoiningStrings {

    public static void main(String[] args) {

        String str1 = "What";
        String str2 = "a";
        String str3 = "Wonderful";
        String str4 = "World";

        String joined = str1+" "+str2+" "+str3+" "+str4;
        System.out.println(joined);

        StringBuilder sbr = new StringBuilder();
        sbr.append(str1).append(str2).append(str3).append(str4);
        System.out.println(sbr.reverse());


    }

}
