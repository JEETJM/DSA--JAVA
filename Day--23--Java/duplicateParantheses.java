import java.util.Stack;

public class duplicateParantheses {

    static boolean hasDuplicateParentheses(String str) {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // If closing parenthesis
            if (ch == ')') {

                int count = 0;

                // Pop until opening parenthesis
                while (!s.isEmpty() && s.peek() != '(') {

                    s.pop();
                    count++;
                }

                // If count == 0, nothing was inside ()
                if (count == 0) {
                    return true;
                }

                // Remove opening '('
                s.pop();
            }

            else {

                // Push every other character
                s.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String str = "((a+b)-(a*b))";

        if (hasDuplicateParentheses(str)) {
            System.out.println("Contains Duplicate Parentheses");
            System.out.println("The Original Expression is : " + str);
        } else {
            System.out.println("Does Not Contain Duplicate Parentheses");
            System.out.println("The Original Expression is : " + str);

        }
    }
}