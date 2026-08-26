public class ZigZagLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head;

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
    }

    // Print Linked List
    static void print() {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " -> ");

            temp = temp.next;
        }

        System.out.println("NULL");
    }

    // Zig Zag Function
    static void zigZag() {

        if (head == null || head.next == null)
            return;

        // Step 1 : Find Middle
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        // Step 2 : Reverse Second Half
        Node curr = mid.next;
        mid.next = null;

        Node prev = null;
        Node next;

        while (curr != null) {

            next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }

        Node left = head;
        Node right = prev;

        // Step 3 : Alternate Merge
        while (left != null && right != null) {

            Node nextL = left.next;
            Node nextR = right.next;

            left.next = right;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {

        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);
        addLast(6);
        addLast(7);
        addLast(8);
        addLast(9);
        addLast(10);

        System.out.println("Original List:");
        print();

        zigZag();

        System.out.println("\nZig Zag List:");
        print();
    }
}