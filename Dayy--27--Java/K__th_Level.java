// import java.util.*;

public class K__th_Level {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Print nodes at kth level
    static void kthLevel(Node root, int level, int k) {

        // No node
        if (root == null) {
            return;
        }

        // Reached kth level
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }

        // Go to next level
        kthLevel(root.left, level + 1, k);
        kthLevel(root.right, level + 1, k);
    }

    public static void main(String[] args) {

        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 3;

        System.out.print("Kth Level: ");

        kthLevel(root, 1, k);
    }
}
