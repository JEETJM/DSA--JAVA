
import java.util.*;
import java.util.LinkedList;

public class TopViewOf_aTree {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static class Pair {

        Node node;
        int hd;

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    static void topView(Node root) {

        if (root == null) {
            return;
        }

        Queue<Pair> q = new LinkedList<>();

        // Root starts at HD = 0
        q.add(new Pair(root, 0));

        // Store first node at every HD
        HashMap<Integer, Integer> map = new HashMap<>();

        while (!q.isEmpty()) {

            Pair current = q.remove();

            Node node = current.node;
            int hd = current.hd;

            // First node at this HD
            if (!map.containsKey(hd)) {

                map.put(hd, node.data);
            }

            // Left child → HD - 1
            if (node.left != null) {

                q.add(new Pair(node.left, hd - 1));
            }

            // Right child → HD + 1
            if (node.right != null) {

                q.add(new Pair(node.right, hd + 1));
            }
        }

        // Print from left to right
        int min = Collections.min(map.keySet());
        int max = Collections.max(map.keySet());

        for (int i = min; i <= max; i++) {

            if (map.containsKey(i)) {
                System.out.print(map.get(i) + " ");
            }
        }
    }

    public static void main(String[] args) {

        /*
         * 1
         * / \
         * 2 3
         * / \ \
         * 4 5 6
         */ 

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        System.out.print("Top View: ");

        topView(root);
    }
}
