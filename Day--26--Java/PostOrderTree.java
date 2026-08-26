import java.util.*;

public class PostOrderTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static Scanner sc = new Scanner(System.in);

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

    // Postorder = Left -> Right -> Root
    static void postorder(Node root) {

        if (root == null) {
            return;
        }

        // 1. Left
        postorder(root.left);

        // 2. Right
        postorder(root.right);

        // 3. Root
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        Node root = buildTree();

        System.out.print("Postorder: ");
        postorder(root);
    }
}