public class Transform_Sum_tree {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Transform Binary Tree into Sum Tree
    static int transformSumTree(Node root) {

        // Empty node
        if (root == null) {
            return 0;
        }

        // Store original value
        int oldValue = root.data;

        // Get sum of left subtree
        int leftSum = transformSumTree(root.left);

        // Get sum of right subtree
        int rightSum = transformSumTree(root.right);

        // Change current node
        root.data = leftSum + rightSum;

        // Return original subtree sum
        return oldValue + leftSum + rightSum;
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

        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        transformSumTree(root);

        System.out.print("Sum Tree: ");
        preorder(root);
    }
}
