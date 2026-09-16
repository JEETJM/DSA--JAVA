import java.util.*;

public class DiameterOfaTree_App2 {

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

    // Store height and diameter
    static class Info {

        int height;
        int diameter;

        Info(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    // Diameter - Approach 2
    static Info diameter(Node root) {

        // Base case
        if (root == null) {
            return new Info(0, 0);
        }

        // Left subtree information
        Info leftInfo = diameter(root.left);

        // Right subtree information
        Info rightInfo = diameter(root.right);

        // Height of current subtree
        int height =
            Math.max(leftInfo.height, rightInfo.height) + 1;

        // Diameter passing through current node
        int selfDiameter =
            leftInfo.height + rightInfo.height + 1;

        // Maximum diameter
        int diameter =
            Math.max(
                selfDiameter,
                Math.max(
                    leftInfo.diameter,
                    rightInfo.diameter
                )
            );

        return new Info(height, diameter);
    }

    public static void main(String[] args) {

        System.out.println("Enter Binary Tree in Preorder:");

        System.out.print("Input: ");

        Node root = buildTree();

        Info result = diameter(root);

        System.out.println();

        System.out.println("Height = " + result.height);
        System.out.println("Diameter = " + result.diameter);
    }
}