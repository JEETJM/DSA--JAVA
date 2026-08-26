// package DSA--JAVA.Day--21--Java;

public class DetectCycle {

    static class Node {

        int data;
        Node next;

        Node(int data) {

            this.data = data;
            this.next = null;
        }
    }

    static Node head;

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

        if (detectCycle()) {

            System.out.println("Cycle Detected");
        }

        else {

            System.out.println("No Cycle");
        }
    }
}