public class TowerOfHanoi {

    static void toh(int n, char src,
                    char helper,
                    char dest) {

        // Base Case
        if(n == 1) {

            System.out.println(
                "Move disk 1 from "
                + src + " to " + dest
            );

            return;
        }

        // Step 1
        toh(n - 1, src, dest, helper);

        // Step 2
        System.out.println(
            "Move disk " + n +
            " from " + src +
            " to " + dest
        );

        // Step 3
        toh(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {

        int n = 3;

        toh(n, 'A', 'B', 'C');
    }
}