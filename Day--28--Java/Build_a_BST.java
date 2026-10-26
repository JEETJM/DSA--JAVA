// import java.util.*;

public class Build_a_BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Insert a value into BST
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

        System.out.println("BST Inorder:");
        inorder(root);
    }

}
