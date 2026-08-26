
public class CircularQueueArray {

    static class CircularQueue {

        int arr[];
        int front;
        int rear;
        int size;

        // Constructor
        CircularQueue(int n) {

            arr = new int[n];

            front = 0;
            rear = -1;
            size = 0;
        }

        // Add / Enqueue
        void add(int data) {

            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }

            rear = (rear + 1) % arr.length;

            arr[rear] = data;

            size++;
        }

        // Remove / Dequeue
        int remove() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int value = arr[front];

            front = (front + 1) % arr.length;

            size--;

            return value;
        }

        // Peek / Front
        int peek() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[front];
        }

        // Check Empty
        boolean isEmpty() {

            return size == 0;
        }

        // Check Full
        boolean isFull() {

            return size == arr.length;
        }

        // Size
        int size() {

            return size;
        }

        // Print Queue
        void print() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }

            System.out.print("Queue: ");

            for (int i = 0; i < size; i++) {

                int index = (front + i) % arr.length;

                System.out.print(arr[index] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        q.print();

        System.out.println("Peek: " + q.peek());

        System.out.println("Removed: " + q.remove());
        System.out.println("Removed: " + q.remove());

        q.print();

        q.add(60);
        q.add(70);

        q.print();

        System.out.println("Peek: " + q.peek());

        System.out.println("Size: " + q.size());

        System.out.println("Is Empty: " + q.isEmpty());
        System.out.println("Is Full: " + q.isFull());
    }
}
