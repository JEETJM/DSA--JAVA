import java.util.Scanner;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking row and column size from user
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Creating matrix
        int[][] matrix = new int[rows][cols];

        // Taking sorted matrix input from user
        System.out.println("\nEnter sorted matrix elements:");
        System.out.println("Rows must be sorted from left to right.");
        System.out.println("Columns must be sorted from top to bottom.\n");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Displaying the matrix
        System.out.println("\nYour Matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Taking search key
        System.out.print("\nEnter number to search: ");
        int key = sc.nextInt();

        // Staircase Search from top-right corner
        int row = 0;
        int col = cols - 1;

        boolean found = false;

        while (row < rows && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("\nElement found at index: [" + row + "][" + col + "]");
                found = true;
                break;
            } else if (key < matrix[row][col]) {
                col--; // move left
            } else {
                row++; // move down
            }
        }

        if (!found) {
            System.out.println("\nElement not found in the matrix.");
        }

        System.out.println("\nTime Complexity = O(rows + cols)");
        System.out.println("For square matrix n x n, Time Complexity = O(n)");
        System.out.println("Extra Space Complexity = O(1)");

        sc.close();
    }
}