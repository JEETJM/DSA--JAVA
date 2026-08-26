import java.util.*;
import java.util.LinkedList;

public class Interleave_Two_Halves_Queue {

    public static void interleave(Queue<Integer> q) {

        int n = q.size();

        // Queue must have even number of elements
        if (n % 2 != 0) {
            System.out.println("Queue size must be even");
            return;
        }

        Queue<Integer> firstHalf = new LinkedList<>();

        // Move first half into another queue
        for (int i = 0; i < n / 2; i++) {
            firstHalf.add(q.remove());
        }

        // Interleave *******************
        while (!firstHalf.isEmpty()) {

            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        System.out.println("Original Queue: " + q);

        interleave(q);

        System.out.println("After Interleaving: " + q);
    }
}