import java.util.*;

public class HeightOfTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static Scanner sc = new Scanner(System.in);

    // Build Binary Tree
    static Node buildTree() {

        System.out.print("Enter data: ");
        int data = sc.nextInt();

        // -1 means no node
        if (data == -1) {
            return null;
        }

        Node root = new Node(data);

        System.out.println("Enter left of " + data);
        root.left = buildTree();

        System.out.println("Enter right of " + data);
        root.right = buildTree();

        return root;
    }

    // Find Height of Binary Tree
    static int height(Node root) {

        // Base case
        if (root == null) {
            return 0;
        }

        // Find height of left subtree
        int leftHeight = height(root.left);

        // Find height of right subtree
        int rightHeight = height(root.right);

        // Return maximum height + 1
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {

        // Build tree
        Node root = buildTree();

        // Calculate height
        int result = height(root);

        System.out.println("Height of Tree: " + result);
    }
}