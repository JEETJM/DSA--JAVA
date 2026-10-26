public class SizeOf_Largest_BST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static class Info {
        int size;
        int min;
        int max;
        boolean isBST;
        int largestBST;

        Info(int size, int min, int max,
                boolean isBST, int largestBST) {
            this.size = size;
            this.min = min;
            this.max = max;
            this.isBST = isBST;
            this.largestBST = largestBST;
        }
    }

    static Info largestBST(Node root) {

        // Empty subtree
        if (root == null) {
            return new Info(
                    0, Integer.MAX_VALUE,
                    Integer.MIN_VALUE, true, 0);
        }

        Info left = largestBST(root.left);
        Info right = largestBST(root.right);

        // Check whether the current subtree is a BST
        if (left.isBST && right.isBST
                && root.data > left.max
                && root.data < right.min) {

            int size = left.size + right.size + 1;

            int min = Math.min(root.data,
                    Math.min(left.min, right.min));

            int max = Math.max(root.data,
                    Math.max(left.max, right.max));

            return new Info(
                    size, min, max, true, size);
        }

        // Current subtree is not a BST
        return new Info(
                0,
                Integer.MIN_VALUE,
                Integer.MAX_VALUE,
                false,
                Math.max(left.largestBST, right.largestBST));
    }

    public static void main(String[] args) {

        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(60);

        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right.left = new Node(45);
        root.right.right = new Node(70);

        Info result = largestBST(root);

        System.out.println(
                "Size of largest BST = " + result.largestBST);
    }
}