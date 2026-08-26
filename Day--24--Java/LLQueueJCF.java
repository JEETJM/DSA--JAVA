
import java.util.*;
import java.util.LinkedList;

public class LLQueueJCF {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        // =====================
        // ADD
        // =====================

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Queue: " + q);

        // =====================
        // OFFER
        // =====================

        q.offer(40);

        System.out.println("After Offer: " + q);

        // =====================
        // PEEK
        // =====================

        System.out.println("Front: " + q.peek());

        // =====================
        // REMOVE
        // =====================

        System.out.println("Removed: " + q.remove());

        System.out.println("Queue: " + q);

        // =====================
        // POLL
        // =====================

        System.out.println("Removed: " + q.poll());

        System.out.println("Queue: " + q);

        // =====================
        // SIZE
        // =====================

        System.out.println("Size: " + q.size());

        // =====================
        // EMPTY
        // =====================

        System.out.println("Is Empty: " + q.isEmpty());
    }
}