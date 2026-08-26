public class AddMiddle {

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

    // Add in Middle
    static void addMiddle(int index, int data) {

        Node newNode = new Node(data);

        // Insert at beginning
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        // Move to (index - 1)th node
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
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
        addLast(40);
        addLast(50);

        System.out.println("Before Insertion:");
        printLL();

        addMiddle(2, 30);

        System.out.println("\nAfter Insertion:");
        printLL();
    }
}
