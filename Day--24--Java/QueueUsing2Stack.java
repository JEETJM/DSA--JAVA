import java.util.Stack;

public class QueueUsing2Stack {
    static class Queue {

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // =========================
        // ADD / ENQUEUE
        // =========================

        void add(int data) {

            s1.push(data);
        }

        // =========================
        // REMOVE / DEQUEUE
        // =========================

        int remove() {

            if (s1.isEmpty() && s2.isEmpty()) {

                System.out.println("Queue is Empty");
                return -1;
            }

            // Transfer only when s2 is empty
            if (s2.isEmpty()) {

                while (!s1.isEmpty()) {

                    s2.push(s1.pop());
                }
            }

            return s2.pop();
        }

        // =========================
        // PEEK
        // =========================

        int peek() {

            if (s1.isEmpty() && s2.isEmpty()) {

                System.out.println("Queue is Empty");
                return -1;
            }

            // Transfer only when s2 is empty
            if (s2.isEmpty()) {

                while (!s1.isEmpty()) {

                    s2.push(s1.pop());
                }
            }

            return s2.peek();
        }

        // =========================
        // IS EMPTY
        // =========================

        boolean isEmpty() {

            return s1.isEmpty() && s2.isEmpty();
        }

        // =========================
        // SIZE
        // =========================

        int size() {

            return s1.size() + s2.size();
        }

        // =========================
        // PRINT
        // =========================

        void print() {

            if (isEmpty()) {

                System.out.println("Queue is Empty");
                return;
            }

            System.out.print("Queue: ");

            // s2 contains front elements
            for (int i = s2.size() - 1; i >= 0; i--) {
                System.out.print(s2.get(i) + " ");
            }

            // s1 contains rear elements
            for (int i = 0; i < s1.size(); i++) {
                System.out.print(s1.get(i) + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println("Queue:");
        q.print();

        System.out.println("Peek: " + q.peek());

        System.out.println("Removed: " + q.remove());

        System.out.println("Removed: " + q.remove());

        q.add(5);

        System.out.println("Queue:");
        q.print();

        System.out.println("Peek: " + q.peek());

        System.out.println("Size: " + q.size());

        System.out.println("Is Empty: " + q.isEmpty());
    }
}

// //ANATHOR CODE VERSION IS HERE :
// import java.util.Stack;

// public class Main {

// static class Queue {

// Stack<Integer> s1 = new Stack<>();
// Stack<Integer> s2 = new Stack<>();

// void add(int data) {

// s1.push(data);
// }

// int remove() {

// if (s1.isEmpty() && s2.isEmpty()) {
// return -1;
// }

// if (s2.isEmpty()) {

// while (!s1.isEmpty()) {
// s2.push(s1.pop());
// }
// }

// return s2.pop();
// }

// int peek() {

// if (s1.isEmpty() && s2.isEmpty()) {
// return -1;
// }

// if (s2.isEmpty()) {

// while (!s1.isEmpty()) {
// s2.push(s1.pop());
// }
// }

// return s2.peek();
// }

// boolean isEmpty() {

// return s1.isEmpty() && s2.isEmpty();
// }
// }

// public static void main(String[] args) {

// Queue q = new Queue();

// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);

// System.out.println("Peek The Item First : " + q.peek());

// System.out.println(q.remove());
// System.out.println(q.remove());

// q.add(5);

// System.out.println(q.remove());
// System.out.println(q.remove());
// System.out.println(q.remove());
// }
// }