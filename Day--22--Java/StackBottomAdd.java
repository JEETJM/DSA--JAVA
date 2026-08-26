
import java.util.Stack;

public class StackBottomAdd {

    static void pushAtBottom(Stack<Integer> stack, int data) {

        // Base Case
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }

        // Remove top element
        int top = stack.pop();

        // Recursively insert data at bottom
        pushAtBottom(stack, data);

        // Put removed element back
        stack.push(top);
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Before:");

        System.out.println(stack);

        pushAtBottom(stack, 40);

        System.out.println("After:");

        System.out.println(stack);
    }
}