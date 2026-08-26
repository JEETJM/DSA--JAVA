public class ReverseNode {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    // Add Last
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

    // Reverse Linked List
    static void reverseLL() {

        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {

            next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }

        head = prev;
    }

    // Print Linked List
    static void printLL() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        addLast(10);
        addLast(20);
        addLast(30);
        addLast(40);

        System.out.println("Original Linked List:");
        printLL();

        reverseLL();

        System.out.println("\nReversed Linked List:");
        printLL();
    }
}