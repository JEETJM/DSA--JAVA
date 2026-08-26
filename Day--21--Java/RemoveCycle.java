public class RemoveCycle {

    static class Node {

        int data;
        Node next;

        Node(int data) {

            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    // Remove Cycle
    static void removeCycle() {

        Node slow = head;
        Node fast = head;

        boolean cycle = false;

        // Step 1 : Detect Cycle
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                cycle = true;
                break;
            }
        }

        if (!cycle) {

            return;
        }

        // Step 2 : Move slow to head
        slow = head;

        Node prev = null;

        // Step 3 : Find start of cycle
        while (slow != fast) {

            prev = fast;

            slow = slow.next;
            fast = fast.next;
        }

        // Step 4 : Remove cycle
        prev.next = null;
    }

    // Detect Cycle
    static boolean detectCycle() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                return true;
            }
        }

        return false;
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

    public static void main(String args[]) {

        head = new Node(10);

        Node second = new Node(20);

        Node third = new Node(30);

        Node fourth = new Node(40);

        Node fifth = new Node(50);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Create Cycle
        fifth.next = third;

        System.out.println("Before Removing:");
        System.out.println(detectCycle());

        removeCycle();

        System.out.println("After Removing:");
        System.out.println(detectCycle());

        printLL();
    }
}
