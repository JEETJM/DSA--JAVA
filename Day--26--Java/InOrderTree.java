import java.util.*;

public class InOrderTree {

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
            // System.out.println("So sad Tree is Null "+data);
            return null;
        }
        // System.out.println();

        Node root = new Node(data);

        System.out.println("Enter left of " + data);
        root.left = buildTree();

        System.out.println("Enter right of " + data);
        root.right = buildTree();

        return root;
    }

    static void Inorder(Node root) {

        if (root == null) {
            return;
        }

        Inorder(root.left);
        System.out.print(root.data + " ");

        Inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = buildTree();

        System.out.print("Inrder: ");
        Inorder(root);
        // System.out.println(root.data);
    }
}
