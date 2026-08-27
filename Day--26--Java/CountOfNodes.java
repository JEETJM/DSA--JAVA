import java.util.*;

public class CountOfNodes {

    // Node class
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

        int data = sc.nextInt();

        // -1 means no node
        if (data == -1) {
            return null;
        }

        Node root = new Node(data);

        root.left = buildTree();
        root.right = buildTree();

        return root;
    }

    // Count Nodes
    static int countNodes(Node root) {

        // No node
        if (root == null) {
            return 0;
        }

        // Count left subtree
        int leftCount = countNodes(root.left);

        // Count right subtree
        int rightCount = countNodes(root.right);

        // Current node + left + right
        return 1 + leftCount + rightCount;
    }

    public static void main(String[] args) {

        System.out.println("Enter tree:");


        Node root = buildTree();

        int count = countNodes(root);

        System.out.println("Number of Nodes = " + count);
    }
}