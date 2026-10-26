public class Print_In_Range_BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Insert into BST
    static Node insert(Node root, int val) {

        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Print nodes in range
    static void printRange(Node root, int k1, int k2) {

        if (root == null) {
            return;
        }

        // Current node is greater than range
        if (root.data > k2) {
            printRange(root.left, k1, k2);
        }

        // Current node is smaller than range
        else if (root.data < k1) {
            printRange(root.right, k1, k2);
        }

        // Current node is inside range
        else {
            printRange(root.left, k1, k2);

            System.out.print(root.data + " ");

            printRange(root.right, k1, k2);
        }
    }

    public static void main(String[] args) {

        Node root = null;

        int[] values = { 50, 30, 70, 20, 40, 60, 80 };

        for (int val : values) {
            root = insert(root, val);
        }

        int k1 = 30;
        int k2 = 70;
        System.out.println("The Key values are : " + k1 + " To " + k2);
        System.out.print("Values in range: ");

        
        printRange(root, k1, k2);
    }
}