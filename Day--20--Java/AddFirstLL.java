public class AddFirstLL {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    // Add First
    static void addFirst(int data) {

        Node newNode = new Node(data);

        // Empty List
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    static void printList() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        addFirst(40);
        addFirst(30);
        addFirst(20);
        addFirst(10);
        addFirst(5);
        addFirst(2);

        printList();
    }
}
