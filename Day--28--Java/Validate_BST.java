public class Validate_BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean isBST(Node root, long min, long max) {

        // Empty tree is a BST
        if (root == null) {
            return true;
        }

        // Current node must be inside the allowed range
        if (root.data <= min || root.data >= max) {
            return false;
        }

        // Left subtree
        boolean leftValid = isBST(root.left, min, root.data);

        // Right subtree
        boolean rightValid = isBST(root.right, root.data, max);

        return leftValid && rightValid;
    }

    public static void main(String[] args) {

        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(70);

        root.left.left = new Node(10);
        root.left.right = new Node(40);

        root.right.left = new Node(60);
        root.right.right = new Node(80);

        if (isBST(root, Long.MIN_VALUE, Long.MAX_VALUE)) {
            System.out.println("Valid BST");
        } else {
            System.out.println("Not a BST");
        }
    }
}