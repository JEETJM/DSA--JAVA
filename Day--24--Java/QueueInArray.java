// package DSA--JAVA.Day--24--Java;

public class QueueInArray {

    static class Queue {

        int arr[];
        int size;
        int rear;

        Queue(int n) {
            arr = new int[n];
            size = 0;
            rear = -1;
        }

        // Add / Enqueue
        void add(int data) {

            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }

            rear++;
            arr[rear] = data;
            size++;
        }

        // Remove / Dequeue
        int remove() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = arr[0];

            // Shift elements to the left
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }

            rear--;
            size--;

            return front;
        }

        // Peek
        int peek() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[0];
        }

        // Is Empty
        boolean isEmpty() {
            return size == 0;
        }

        // Is Full
        boolean isFull() {
            return size == arr.length;
        }

        // Size
        int size() {
            return size;
        }

        // Print
        void print() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }

            System.out.print("Queue: ");

            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        q.print();

        System.out.println("Peek: " + q.peek());

        System.out.println("Removed: " + q.remove());

        q.print();

        System.out.println("Peek: " + q.peek());

        System.out.println("Size: " + q.size());

        System.out.println("Is Empty: " + q.isEmpty());
    }
}
