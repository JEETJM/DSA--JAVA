import java.util.Stack;

public class StacksLL_Jcf {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Push
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack : " + stack);

        // Peek
        System.out.println("Top : " + stack.peek());

        // Pop
        System.out.println("Pop : " + stack.pop());

        System.out.println("After Pop : " + stack);

        // Size
        System.out.println("Size : " + stack.size());

        // Empty
        System.out.println("Is Empty : " + stack.empty());

        // Search
        System.out.println("Search 20 : " + stack.search(20));
    }
}
