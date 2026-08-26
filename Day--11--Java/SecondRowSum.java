import java.util.Scanner;

public class SecondRowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking rows and columns from user
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] nums = new int[rows][cols];

        // Taking matrix input
        System.out.println("\nEnter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                nums[i][j] = sc.nextInt();
            }
        }

        // Check if second row exists
        if (rows < 2) {
            System.out.println("\nSecond row does not exist.");
        } else {
            int sum = 0;

            // Second row index is 1
            for (int j = 0; j < cols; j++) {
                sum += nums[1][j];
            }

            System.out.println("\nSum of second row = " + sum);
        }

        sc.close();
    }
}