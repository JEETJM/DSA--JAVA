// import java.util.*;

public class subTreeOf_aAnotherTree {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Check whether two trees are identical
    static boolean isIdentical(Node root1, Node root2) {

        // Both are empty
        if (root1 == null && root2 == null) {
            return true;
        }

        // Only one is empty
        if (root1 == null || root2 == null) {
            return false;
        }

        // Values are different
        if (root1.data != root2.data) {
            return false;
        }

        // Check left and right
        return isIdentical(root1.left, root2.left)
                && isIdentical(root1.right, root2.right);
    }

    // Check whether subRoot is a subtree of root
    static boolean isSubtree(Node root, Node subRoot) {

        // Empty tree is always a subtree
        if (subRoot == null) {
            return true;
        }

        // Main tree is empty but subTree is not
        if (root == null) {
            return false;
        }

        // Check if current tree is identical to subTree
        if (isIdentical(root, subRoot)) {
            return true;
        }

        // Search in left or right subtree
        return isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {

        /*
             Main Tree:

                  1
                /   \
               2     3
              / \
             4   5

             Sub Tree:

                  2
                 / \
                4   5
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Node subRoot = new Node(2);

        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        if (isSubtree(root, subRoot)) {
            System.out.println("Subtree exists");
        } else {
            System.out.println("Subtree does not exist");
        }
    }
}