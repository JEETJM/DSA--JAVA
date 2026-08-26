public class RemoveNth {

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

    static void removeNthFromEnd(int n) {

        // Step 1 : Find Size
        int size = 0;
        Node temp = head;

        while (temp != null) {

            size++;
            temp = temp.next;
        }

        // Delete First Node
        if (size == n) {

            head = head.next;
            return;
        }

        // Step 2 : Move to Previous Node
        int index = size - n;

        Node prev = head;

        for (int i = 1; i < index; i++) {

            prev = prev.next;
        }

        // Step 3 : Delete Node
        prev.next = prev.next.next;
    }

    static void printLL() {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " -> ");

            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String args[]) {

        addLast(10);
        addLast(20);
        addLast(30);
        addLast(40);
        addLast(50);

        System.out.println("Original List");
        printLL();

        removeNthFromEnd(2);

        System.out.println("\nAfter Deletion");
        printLL();
    }
}