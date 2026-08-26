
import java.util.Stack;

public class validParentheses {

    static boolean isValid(String str) {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {

                s.push(ch);
            }

            // Closing bracket )
            else if (ch == ')') {

                if (s.isEmpty() || s.peek() != '(') {
                    return false;
                }

                s.pop();
            }

            // Closing bracket ]
            else if (ch == ']') {

                if (s.isEmpty() || s.peek() != '[') {
                    return false;
                }

                s.pop();
            }

            // Closing bracket }
            else if (ch == '}') {

                if (s.isEmpty() || s.peek() != '{') {
                    return false;
                }

                s.pop();
            }
        }

        return s.isEmpty();
    }

    public static void main(String[] args) {

        String str = "([{}(((())))])";

        if (isValid(str)) {
            System.out.println("Valid Parentheses");
            System.out.print("The String is: " + str);
        } else {
            System.out.println("Invalid Parentheses");
            System.out.print("The String is: " + str);
        }
    }
}