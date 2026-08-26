import java.util.*;

public class StackDeque {

    static class Stack {

        Deque<Integer> deque = new ArrayDeque<>();

        // PUSH
        void push(int data) {
            deque.addLast(data);
        }

        // POP
        int pop() {

            if (deque.isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            return deque.removeLast();
        }

        // PEEK
        int peek() {

            if (deque.isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            return deque.peekLast();
        }

        // SIZE
        int size() {
            return deque.size();
        }

        // isEmpty
        boolean isEmpty() {
            return deque.isEmpty();
        }

        // PRINT
        void printStack() {

            System.out.println("Stack: " + deque);
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.printStack();

        System.out.println("Top: " + s.peek());

        System.out.println("Pop: " + s.pop());

        System.out.println("Top: " + s.peek());

        System.out.println("Size: " + s.size());

        System.out.println("Is Empty: " + s.isEmpty());
    }
}
