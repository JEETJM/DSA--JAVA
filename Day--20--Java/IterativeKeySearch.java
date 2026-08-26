public class IterativeKeySearch {

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

    // Iterative Search
    static int iterativeSearch(int key) {

        Node temp = head;
        int index = 0;

        while (temp != null) {

            if (temp.data == key) {
                return index;
            }

            temp = temp.next;
            index++;
        }

        return -1;
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

        int key = 30;

        int index = iterativeSearch(key);

        if (index != -1) {
            System.out.println("Key Found at Index = " + index);
        } else {
            System.out.println("Key Not Found");
        }
    }
}