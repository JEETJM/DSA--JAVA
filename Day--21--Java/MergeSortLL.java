public class MergeSortLL {
    

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    // Add at end
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
    static void print(Node head) {

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("NULL");
    }

    // Find Middle
    static Node getMid(Node head) {

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Merge Two Sorted Lists
    static Node merge(Node left, Node right) {

        Node dummy = new Node(-1);

        Node temp = dummy;

        while (left != null && right != null) {

            if (left.data <= right.data) {

                temp.next = left;
                left = left.next;
            }

            else {

                temp.next = right;
                right = right.next;
            }

            temp = temp.next;
        }

        while (left != null) {

            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        while (right != null) {

            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return dummy.next;
    }

    // Merge Sort
    static Node mergeSort(Node head) {

        if (head == null || head.next == null)
            return head;

        Node mid = getMid(head);

        Node rightHead = mid.next;

        mid.next = null;

        Node left = mergeSort(head);

        Node right = mergeSort(rightHead);

        return merge(left, right);
    }

    public static void main(String args[]) {

        addLast(8);
        addLast(3);
        addLast(5);
        addLast(4);
        addLast(7);
        addLast(6);
        addLast(1);
        addLast(2);

        System.out.println("Original Linked List:");

        print(head);

        head = mergeSort(head);

        System.out.println();

        System.out.println("Sorted Linked List:");

        print(head);
    }
}