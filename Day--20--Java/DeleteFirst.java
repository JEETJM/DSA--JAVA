public class DeleteFirst {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static void addLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Remove First
    static void removeFirst() {

        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        head = head.next;
    }

    static void printLL() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        addLast(5);
        addLast(10);
        addLast(20);
        addLast(30);
        addLast(40);
        addLast(50);

        System.out.println("Before Deletion:");
        printLL();

        removeFirst();

        System.out.println("After Deletion:");
        printLL();
    }
}