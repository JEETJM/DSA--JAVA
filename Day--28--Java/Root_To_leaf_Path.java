import java.util.ArrayList;

public class Root_To_leaf_Path {

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

    // Print root to leaf paths
    static void printPaths(Node root, ArrayList<Integer> path) {

        // Base case
        if (root == null) {
            return;
        }

        // Add current node
        path.add(root.data);

        // If leaf node
        if (root.left == null && root.right == null) {

            for (int i = 0; i < path.size(); i++) {
                System.out.print(path.get(i));

                if (i != path.size() - 1) {
                    System.out.print(" -> ");
                }
            }

            System.out.println();
        }

        // Go left
        printPaths(root.left, path);

        // Go right
        printPaths(root.right, path);

        // Backtracking
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {

        Node root = null;

        int[] values = { 50, 30, 70, 20, 40, 60, 80 };

        for (int val : values) {
            root = insert(root, val);
        }

        ArrayList<Integer> path = new ArrayList<>();
        System.out.println("The Original Tree is ");
        System.out.println("Root to Leaf Paths:");

        printPaths(root, path);
    }
}
