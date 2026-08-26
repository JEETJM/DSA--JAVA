public class DoublyLL {

    static class Node {

        int data;
        Node prev;
        Node next;

        Node(int data) {

            this.data = data;
            prev = null;
            next = null;
        }
    }

    static Node head = null;

    static void addFirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

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

    static void printForward() {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " <-> ");

            temp = temp.next;
        }

        System.out.println("NULL");
    }

    static void printBackward() {

        Node temp = head;

        while (temp.next != null)
            temp = temp.next;

        while (temp != null) {

            System.out.print(temp.data + " <-> ");

            temp = temp.prev;
        }

        System.out.println("NULL");
    }

    public static void main(String args[]) {

        addFirst(20);
        addFirst(10);

        addLast(30);
        addLast(40);

        printForward();

        printBackward();
    }
}