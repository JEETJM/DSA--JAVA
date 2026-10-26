public class Delete_Node_BST {

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

    // Find the smallest node
    static Node findMin(Node root) {

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    // Delete a node
    static Node delete(Node root, int key) {

        // Node not found
        if (root == null) {
            return null;
        }

        // Search in left subtree
        if (key < root.data) {
            root.left = delete(root.left, key);
        }

        // Search in right subtree
        else if (key > root.data) {
            root.right = delete(root.right, key);
        }

        // Node found
        else {

            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: Only right child
            if (root.left == null) {
                return root.right;
            }

            // Case 2: Only left child
            if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            Node successor = findMin(root.right);

            root.data = successor.data;

            root.right = delete(root.right, successor.data);
        }

        return root;
    }

    // Inorder traversal
    static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = null;

        int[] values = { 50, 30, 70, 20, 40, 60, 80 };

        for (int val : values) {
            root = insert(root, val);
        }

        System.out.print("Before deletion: ");
        inorder(root);

        // Delete 50
        root = delete(root, 50);

        System.out.print("\nAfter deletion: ");
        inorder(root);
    }
}
