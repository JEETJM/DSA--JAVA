// import java.util.Scanner;

// public class DiagonalMatrix {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Taking matrix size from user
//         System.out.print("Enter size of square matrix: ");
//         int n = sc.nextInt();

//         int[][] matrix = new int[n][n];

//         // Taking matrix elements from user
//         System.out.println("Enter matrix elements:");

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print("Enter element at [" + i + "][" + j + "]: ");
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         // Displaying the matrix
//         System.out.println("\nYour Matrix:");

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(matrix[i][j] + "\t");
//             }
//             System.out.println();
//         }

//         int primarySum = 0;
//         int secondarySum = 0;

//         // Calculating diagonal sums
//         for (int i = 0; i < n; i++) {
//             primarySum += matrix[i][i];
//             secondarySum += matrix[i][n - 1 - i];
//         }

//         // Printing primary diagonal
//         System.out.println("\nPrimary Diagonal Elements:");

//         for (int i = 0; i < n; i++) {
//             System.out.print(matrix[i][i] + " ");
//         }

//         // Printing secondary diagonal
//         System.out.println("\n\nSecondary Diagonal Elements:");

//         for (int i = 0; i < n; i++) {
//             System.out.print(matrix[i][n - 1 - i] + " ");
//         }

//         System.out.println("\n\nPrimary Diagonal Sum = " + primarySum);
//         System.out.println("Secondary Diagonal Sum = " + secondarySum);

//         int totalDiagonalSum = primarySum + secondarySum;

//         // If matrix size is odd, middle element is counted twice
//         if (n % 2 == 1) {
//             int middle = matrix[n / 2][n / 2];
//             totalDiagonalSum = totalDiagonalSum - middle;
//         }

//         System.out.println("Total Diagonal Sum = " + totalDiagonalSum);

//         sc.close();
//     }
// }

//optimized version !!
import java.util.Scanner;

public class OptimizedDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take matrix size from user
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        // Step 2: Create square matrix
        int[][] matrix = new int[n][n];

        // Step 3: Take matrix elements from user
        System.out.println("\nEnter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Step 4: Display original matrix
        System.out.println("\nOriginal Matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Step 5: Optimized diagonal sum calculation
        int diagonalSum = 0;

        for (int i = 0; i < n; i++) {

            // Add primary diagonal element
            diagonalSum += matrix[i][i];

            // Add secondary diagonal element only if it is not same as primary diagonal
            // element
            if (i != n - 1 - i) {
                diagonalSum += matrix[i][n - 1 - i];
            }
        }

        // Step 6: Print result
        System.out.println("\nNormal Diagonal Sum = " + diagonalSum);

        // Step 7: Print complexity
        System.out.println("\nTime Complexity of diagonal calculation = O(n)");
        System.out.println("Overall Time Complexity with input/display = O(n^2)");
        System.out.println("Space Complexity = O(n^2)");

        sc.close();
    }
}