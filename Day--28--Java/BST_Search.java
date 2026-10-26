// /e DSA--JAVA.Day--28--Java;

public class BST_Search {
   
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

    // Search in BST
    static boolean search(Node root, int key) {

        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (key < root.data) {
            return search(root.left, key);
        }

        return search(root.right, key);
    }

    public static void main(String[] args) {

        Node root = null;

        int[] values = {50, 30, 70, 20, 40, 60, 80};

        // Build BST
        for (int val : values) {
            root = insert(root, val);
        }

        int key = 60;

        if (search(root, key)) {
            System.out.println(key + " Found");
        } else {
            System.out.println(key + " Not Found");
        }
    }
}
