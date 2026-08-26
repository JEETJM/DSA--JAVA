import java.util.*;

public class DequeAllOperations {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        // Add at front
        dq.addFirst(20);
        dq.addFirst(10);

        // Add at rear
        dq.addLast(30);
        dq.addLast(40);

        System.out.println("Deque: " + dq);

        // Peek front
        System.out.println("First: " + dq.getFirst());

        // Peek rear
        System.out.println("Last: " + dq.getLast());

        // Remove front
        System.out.println("Removed First: " + dq.removeFirst());

        // Remove rear
        System.out.println("Removed Last: " + dq.removeLast());

        System.out.println("Deque after removal: " + dq);

        // Size
        System.out.println("Size: " + dq.size());

        // Empty
        System.out.println("Is Empty: " + dq.isEmpty());
    }
}
