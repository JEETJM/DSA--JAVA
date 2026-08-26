public class AddLastLL {

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

        // Empty List
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

    static void printList() {

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

        printList();
    }
}
