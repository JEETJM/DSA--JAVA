import java.util.Scanner;

public class MaxMinMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] mat = new int[r][c];

        System.out.println("Enter matrix elements:");

        // Input
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int max = mat[0][0];
        int min = mat[0][0];

        // Find max & min
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] > max) {
                    max = mat[i][j];
                }
                if (mat[i][j] < min) {
                    min = mat[i][j];
                }
            }
        }

        System.out.println("Largest element: " + max);
        System.out.println("Smallest element: " + min);

        sc.close();
    }
}