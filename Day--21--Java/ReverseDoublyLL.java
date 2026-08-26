public class ReverseDoublyLL {

    static class Node {

        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
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

        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Print DLL
    static void print() {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " <-> ");

            temp = temp.next;
        }

        System.out.println("NULL");
    }

    // Reverse DLL
    static void reverse() {

        Node curr = head;
        Node temp = null;

        while (curr != null) {

            // Store previous
            temp = curr.prev;

            // Swap prev and next
            curr.prev = curr.next;
            curr.next = temp;

            // Move to next node
            curr = curr.prev;
        }

        // Change Head
        if (temp != null) {
            head = temp.prev;
        }
    }

    public static void main(String args[]) {

        addLast(10);
        addLast(20);
        addLast(30);
        addLast(40);

        System.out.println("Original DLL:");

        print();

        reverse();

        System.out.println();

        System.out.println("Reversed DLL:");

        print();
    }
}