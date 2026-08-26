import java.util.Scanner;

public class CountSevenIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking rows and columns from user
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];

        // Taking array input
        System.out.println("\nEnter array elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }

        // Count number of 7s
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] == 7) {
                    count++;
                }
            }
        }

        System.out.println("\nNumber of 7's = " + count);

        sc.close();
    }
}