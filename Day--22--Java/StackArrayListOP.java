
// package DSA--JAVA.Day--22--Java;
import java.util.ArrayList;

public class StackArrayListOP {

    static class Stack {

        ArrayList<Integer> list = new ArrayList<>();

        // Push
        public void push(int data) {
            list.add(data);
        }

        // Pop
        public int pop() {

            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek
        public int peek() {

            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            return list.get(list.size() - 1);
        }

        // Size
        public int size() {
            return list.size();
        }

        // isEmpty
        public boolean isEmpty() {
            return list.size() == 0;
        }

        // Print Stack
        public void printStack() {

            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return;
            }

            System.out.print("Stack: ");

            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.print(list.get(i) + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.printStack();

        System.out.println("Top Element : " + s.peek());

        System.out.println("Stack Size : " + s.size());

        System.out.println("Popped : " + s.pop());

        s.printStack();

        System.out.println("Top Element : " + s.peek());

        System.out.println("Stack Size : " + s.size());

        System.out.println("Is Empty : " + s.isEmpty());
    }
}