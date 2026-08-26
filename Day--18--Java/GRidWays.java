import java.util.Scanner;

public class GRidWays {

    static int gridWays(int i, int j, int n, int m) {

        // Destination reached
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // Out of boundary
        if (i == n || j == m) {
            return 0;
        }

        // Down
        int down = gridWays(i + 1, j, n, m);

        // Right
        int right = gridWays(i, j + 1, n, m);

        return down + right;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size of the Grid: ");
        int n = sc.nextInt();
        System.out.print("Enter Column size of Grid: ");
        int m = sc.nextInt();
        // int m = 3;

        System.out.println("Total Ways = " + gridWays(0, 0, n, m));
        sc.close();
    }

}