import java.util.*;
import java.util.LinkedList;

public class LevelOrderTree {

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

    // Level Order Traversal - Level Wise
    static void levelOrder(Node root) {

        // If tree is empty
        if (root == null) {
            return;
        }

        // Queue
        Queue<Node> queue = new LinkedList<>();

        // Add root to queue
        queue.add(root);

        // Continue until queue becomes empty
        while (!queue.isEmpty()) {

            // Number of nodes in current level
            int size = queue.size();

            // Process all nodes of current level
            for (int i = 0; i < size; i++) {

                // Remove front node
                Node current = queue.remove();

                // Print current node
                System.out.print(current.data + " ");

                // Add left child
                if (current.left != null) {
                    queue.add(current.left);
                }

                // Add right child
                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            // New line after each level
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Build tree
        Node root = buildTree();

        // Print level order
        System.out.println("Level Order:");

        levelOrder(root);
    }
}