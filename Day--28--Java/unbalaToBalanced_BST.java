import java.util.ArrayList;

public class unbalaToBalanced_BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Insert into BST
    static Node insert(Node root, int val) {

        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Store inorder elements in sorted array/list
    static void inorderToArray(Node root, ArrayList<Integer> list) {

        if (root == null) {
            return;
        }

        inorderToArray(root.left, list);

        list.add(root.data);

        inorderToArray(root.right, list);
    }

    // Create balanced BST from sorted list
    static Node buildBalancedBST(ArrayList<Integer> list, int start, int end) {

        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;

        Node root = new Node(list.get(mid));

        root.left = buildBalancedBST(list, start, mid - 1);

        root.right = buildBalancedBST(list, mid + 1, end);

        return root;
    }

    // Convert BST to balanced BST
    static Node balanceBST(Node root) {

        ArrayList<Integer> list = new ArrayList<>();

        // Step 1: BST -> sorted array
        inorderToArray(root, list);

        // Step 2: sorted array -> balanced BST
        return buildBalancedBST(list, 0, list.size() - 1);
    }

    // Inorder traversal
    static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Preorder traversal
    static void preorder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        Node root = null;

        int[] values = { 10, 20, 30, 40, 50 };

        for (int val : values) {
            root = insert(root, val);
        }

        System.out.println("Original BST:");

        System.out.print("Inorder: ");
        inorder(root);

        System.out.print("\nPreorder: ");
        preorder(root);

        // Convert to balanced BST
        root = balanceBST(root);

        System.out.println("\n\nBalanced BST:");

        System.out.print("Inorder: ");
        inorder(root);

        System.out.print("\nPreorder: ");
        preorder(root);
    }
}