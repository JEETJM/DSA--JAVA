// import java.util.*;

public class LOwest_Common_Ancestor {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node lca(Node root, int n1, int n2) {

        // No node
        if (root == null) {
            return null;
        }

        // Found one of the target nodes
        if (root.data == n1 || root.data == n2) {
            return root;
        }

        // Search left
        Node leftLca = lca(root.left, n1, n2);

        // Search right
        Node rightLca = lca(root.right, n1, n2);

        // One node found on each side
        if (leftLca != null && rightLca != null) {
            return root;
        }

        // Only left side has a result
        if (leftLca != null) {
            return leftLca;
        }

        // Only right side has a result
        return rightLca;
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

        int n1 = 4;
        int n2 = 5;

        Node result = lca(root, n1, n2);

        System.out.println("LCA = " + result.data);
    }
}
