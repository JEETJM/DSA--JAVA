
public class QueueAllOpLL {

    static class Queue {

        // Node
        static class Node {

            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node front;
        Node rear;
        int size;

        // Constructor
        Queue() {

            front = null;
            rear = null;
            size = 0;
        }

        // =========================
        // ADD / ENQUEUE
        // =========================

        void add(int data) {

            Node newNode = new Node(data);

            // Queue is empty
            if (rear == null) {

                front = newNode;
                rear = newNode;

            } else {

                rear.next = newNode;
                rear = newNode;
            }

            size++;
        }

        // =========================
        // REMOVE / DEQUEUE
        // =========================

        int remove() {

            // Queue is empty
            if (front == null) {

                System.out.println("Queue is Empty");
                return -1;
            }

            int value = front.data;

            front = front.next;

            // If Queue becomes empty
            if (front == null) {
                rear = null;
            }

            size--;

            return value;
        }

        // =========================
        // PEEK
        // =========================

        int peek() {

            if (front == null) {

                System.out.println("Queue is Empty");
                return -1;
            }

            return front.data;
        }

        // =========================
        // SIZE
        // =========================

        int size() {

            return size;
        }

        // =========================
        // IS EMPTY
        // =========================

        boolean isEmpty() {

            return front == null;
        }

        // =========================
        // PRINT
        // =========================

        void print() {

            if (isEmpty()) {

                System.out.println("Queue is Empty");
                return;
            }

            Node current = front;

            System.out.print("Queue: ");

            while (current != null) {

                System.out.print(current.data + " ");

                current = current.next;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        // Add
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        q.print();

        // Peek
        System.out.println("Front: " + q.peek());

        // Remove
        System.out.println("Removed: " + q.remove());

        q.print();

        System.out.println("Removed: " + q.remove());

        q.print();

        // Size
        System.out.println("Size: " + q.size());

        // Empty
        System.out.println("Is Empty: " + q.isEmpty());
    }
}