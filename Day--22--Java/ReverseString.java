
import java.util.ArrayList;

public class ReverseString {

    static class Stack {

        ArrayList<Character> list = new ArrayList<>();

        void push(char data) {
            list.add(data);
        }

        char pop() {
            return list.remove(list.size() - 1);
        }

        boolean isEmpty() {
            return list.isEmpty();
        }
    }

    static String reverseString(String str) {

        Stack s = new Stack();

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        StringBuilder result = new StringBuilder();

        while (!s.isEmpty()) {
            result.append(s.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String str = "abcd";
        System.out.println("Original String: " + str);

        System.out.println("Reverse = " + reverseString(str));
    }
}
