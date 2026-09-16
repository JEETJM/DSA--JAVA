import java.util.*;

public class DiameterOfaTree_App1 {

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

    // Height
    static int height(Node root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Diameter - Approach 1
    static int diameter(Node root) {

        if (root == null) {
            return 0;
        }

        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int selfDiameter = leftHeight + rightHeight + 1;

        return Math.max(
            selfDiameter,
            Math.max(leftDiameter, rightDiameter)
        );
    }

    public static void main(String[] args) {

        System.out.println("Enter Binary Tree in Preorder:");
        // System.out.println("-1 means no node.");
        // System.out.println("Example: 1 2 4 -1 -1 5 -1 -1 3 -1 -1");

        System.out.print("Input: ");

        Node root = buildTree();

        System.out.println();

        System.out.println("Height = " + height(root));
        System.out.println("Diameter = " + diameter(root));
    }
}