public class StackUsingLL {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {

        static Node head = null;

        // isEmpty
        public boolean isEmpty() {
            return head == null;
        }

        // Push
        public void push(int data) {

            Node newNode = new Node(data);

            newNode.next = head;

            head = newNode;
        }

        // Pop
        public int pop() {

            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = head.data;

            head = head.next;

            return top;
        }

        // Peek
        public int peek() {

            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            return head.data;
        }

        // Size
        public int size() {

            int count = 0;

            Node temp = head;

            while (temp != null) {

                count++;

                temp = temp.next;
            }

            return count;
        }

        // Print Stack
        public void printStack() {

            Node temp = head;

            System.out.print("Top -> ");

            while (temp != null) {

                System.out.print(temp.data + " ");

                temp = temp.next;
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

        System.out.println("Size : " + s.size());

        System.out.println("Popped : " + s.pop());

        s.printStack();

        System.out.println("Top Element : " + s.peek());

        System.out.println("Size : " + s.size());

        System.out.println("Is Empty : " + s.isEmpty());
    }
}
