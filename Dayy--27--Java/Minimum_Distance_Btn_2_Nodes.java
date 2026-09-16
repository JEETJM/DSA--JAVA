public class Minimum_Distance_Btn_2_Nodes {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Find LCA
    static Node lca(Node root, int n1, int n2) {

        if (root == null) {
            return null;
        }

        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);

        if (leftLca != null && rightLca != null) {
            return root;
        }

        if (leftLca != null) {
            return leftLca;
        }

        return rightLca;
    }

    // Find distance from root to target node
    static int distance(Node root, int target) {

        if (root == null) {
            return -1;
        }

        if (root.data == target) {
            return 0;
        }

        int leftDistance = distance(root.left, target);

        if (leftDistance != -1) {
            return leftDistance + 1;
        }

        int rightDistance = distance(root.right, target);

        if (rightDistance != -1) {
            return rightDistance + 1;
        }

        return -1;
    }

    // Minimum distance between two nodes
    static int minDistance(Node root, int n1, int n2) {

        Node ancestor = lca(root, n1, n2);

        int distance1 = distance(ancestor, n1);
        int distance2 = distance(ancestor, n2);

        return distance1 + distance2;
    }

    public static void main(String[] args) {

        /*
         *   1
         *  /  \
         *  2   3
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

        int n1 = 7;
        int n2 = 6;

        int result = minDistance(root, n1, n2);

        System.out.println("Minimum Distance = " + result);
    }
}