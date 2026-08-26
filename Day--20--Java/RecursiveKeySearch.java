public class RecursiveKeySearch {

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

    // Recursive Search Helper
    static int helper(Node head, int key) {

        // Base Case
        if (head == null) {
            return -1;
        }

        // Key Found
        if (head.data == key) {
            return 0;
        }

        int index = helper(head.next, key);

        if (index == -1) {
            return -1;
        }

        return index + 1;
    }

    // Recursive Search Function
    static int recursiveSearch(int key) {
        return helper(head, key);
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
        addLast(50);

        printLL();

        int key = 40;
        System.out.print("My Key is : " + key);
        System.out.println();

        int index = recursiveSearch(key);

        if (index != -1) {
            System.out.println("Key Found at Index = " + index);
        } else {
            System.out.println("Key Not Found");
        }
    }
}