import java.util.Stack;

public class ReverseStack {

    static void reverse(Stack<Integer> stack) {

        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();

        reverse(stack);

        pushAtBottom(stack, top);
    }

    static void pushAtBottom(Stack<Integer> stack, int data) {

        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }

        int top = stack.pop();

        pushAtBottom(stack, data);

        stack.push(top);
    }

    // Print from bottom to top
    static void printBottom(Stack<Integer> stack) {

        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        // System.out.println(stack);

        reverse(stack);

        printBottom(stack);
        // System.out.println(stack);
    }
}
