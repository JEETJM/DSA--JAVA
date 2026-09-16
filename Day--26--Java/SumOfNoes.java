import java.util.*;

public class SumOfNoes {

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
        //Pre Order Tree .
        Node root = new Node(data);

        root.left = buildTree();

        root.right = buildTree();

        return root;
    }

    // Sum of Nodes
    static int sumNodes(Node root) {

        if (root == null) {
            return 0;
        }

        int leftSum = sumNodes(root.left);

        int rightSum = sumNodes(root.right);

        return root.data + leftSum + rightSum;
    }

    public static void main(String[] args) {

        System.out.println("Enter tree:");

        Node root = buildTree();

        int sum = sumNodes(root);

        System.out.println("Sum of Nodes = " + sum);
    }
}