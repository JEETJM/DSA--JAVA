
import java.util.*;
import java.util.LinkedList;

public class StackUsing2Queues {

    static class Stack {

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // PUSH
        void push(int data) {

            // Add new element to q2
            q2.add(data);

            // Move all elements from q1 to q2
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }

            // Swap q1 and q2
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        // POP
        int pop() {

            if (q1.isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            return q1.remove();
        }

        // PEEK
        int peek() {

            if (q1.isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            return q1.peek();
        }

        // IS EMPTY
        boolean isEmpty() {

            return q1.isEmpty();
        }

        // SIZE
        int size() {

            return q1.size();
        }

        // PRINT
        void print() {

            System.out.println("Stack: " + q1);
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        s.print();

        System.out.println("Top: " + s.peek());

        System.out.println("Pop: " + s.pop());

        s.print();

        System.out.println("Size: " + s.size());

        System.out.println("Is Empty: " + s.isEmpty());
    }
}