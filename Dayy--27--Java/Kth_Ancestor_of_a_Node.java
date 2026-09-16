public class Kth_Ancestor_of_a_Node {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static int kthAncestor(Node root, int target, int k) {

        // Target not found
        if (root == null) {
            return -1;
        }

        // Target node found
        if (root.data == target) {
            return 0;
        }

        // Search in left subtree
        int leftDistance = kthAncestor(root.left, target, k);

        // Target found in left subtree
        if (leftDistance != -1) {

            if (leftDistance + 1 == k) {
                System.out.println("Kth Ancestor = " + root.data);
            }

            return leftDistance + 1;
        }

        // Search in right subtree
        int rightDistance = kthAncestor(root.right, target, k);

        // Target found in right subtree
        if (rightDistance != -1) {

            if (rightDistance + 1 == k) {
                System.out.println("Kth Ancestor = " + root.data);
            }

            return rightDistance + 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        /*
         * 1
         * / \
         * 2 3
         * / \
         * 4 5
         * /
         * 8
         */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.left.left.left = new Node(8);

        int target = 8;
        int k = 2;

        kthAncestor(root, target, k);
    }
}