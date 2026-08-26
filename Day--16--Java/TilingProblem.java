import java.util.Scanner;

public class TilingProblem {

    static int tiling(int n) {

        // Base Case
        if(n == 0 || n == 1) {
            return 1;
        }

        // Vertical Choice
        int verticalWays = tiling(n - 1);

        // Horizontal Choice
        int horizontalWays = tiling(n - 2);

        // Total Ways
        return verticalWays + horizontalWays;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");

        int n = sc.nextInt();

        int ans = tiling(n);

        System.out.println("Total Ways = " + ans);

        sc.close();
    }
}