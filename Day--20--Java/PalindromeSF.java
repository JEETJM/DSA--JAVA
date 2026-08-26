public class PalindromeSF {

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

    // Find Middle (Slow & Fast Pointer)###########################-->
    static Node findMid(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;

            fast = fast.next.next;
        }

        return slow;
    }

    // Reverse Linked List **************************************--->
    static Node reverse(Node head) {

        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {

            next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }

        return prev;
    }

    // Check Palindrome
    static boolean isPalindrome() {

        if (head == null || head.next == null) {

            return true;
        }

        // Step 1 : Find Middle
        Node mid = findMid(head);

        // Step 2 : Reverse Second Half
        Node secondHalf = reverse(mid);

        // Step 3 : Compare
        Node firstHalf = head;

        while (secondHalf != null) {

            if (firstHalf.data != secondHalf.data) {

                return false;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
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

        addLast(1);
        addLast(2);
        addLast(3);
        addLast(2);
        addLast(1);

        printLL();

        if (isPalindrome()) {

            System.out.println("Palindrome");
        }

        else {

            System.out.println("Not Palindrome");
        }
    }
}
