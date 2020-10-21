import java.util.Stack;
import java.util.regex.Pattern;

public class BackspacesInString {


        public static String cleanString(String s) {
            // your code here

            Stack<Character> stack = new Stack<>();

            for (int i =0; i <s.length(); i++){
                if (s.charAt(i) != '#'){
                    stack.push(s.charAt(i));
                } else if  (!(stack.empty())){
                    stack.pop();
                }
            }

            StringBuilder stringBuilder = new StringBuilder();
            while (!stack.isEmpty()) {
                stringBuilder.append(stack.pop());
            }
            return  stringBuilder.reverse().toString();
        }

    public static void main(String[] args) {
        System.out.println(cleanString("abc#d##c"));
    }

}
