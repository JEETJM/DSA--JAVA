// import java.util.*;
public class sortedArrayToBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Convert sorted array to balanced BST
    static Node sortedArrayToBst(int[] arr, int start, int end) {

        // No elements
        if (start > end) {
            return null;
        }

        // Find middle element
        int mid = start + (end - start) / 2;

        // Middle element becomes root
        Node root = new Node(arr[mid]);

        // Left half becomes left subtree
        root.left = sortedArrayToBst(arr, start, mid - 1);

        // Right half becomes right subtree
        root.right = sortedArrayToBst(arr, mid + 1, end);

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

    // Preorder traversal
    static void preorder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };

        Node root = sortedArrayToBst(arr, 0, arr.length - 1);

        System.out.print("Inorder: ");
        inorder(root);

        System.out.print("\nPreorder: ");
        preorder(root);
    }
}