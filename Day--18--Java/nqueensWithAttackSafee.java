import java.util.Scanner;

public class nqueensWithAttackSafee {

    static int N;

    // Check if it is safe to place a queen
    static boolean isSafe(char[][] board, int row, int col) {

        // Check same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    // Solve using Backtracking
    static void solve(char[][] board, int row) {

        // Base Case
        if (row == N) {

            System.out.println("-------- CHESS BOARD --------");

            for (char[] r : board) {
                for (char ch : r) {
                    System.out.print(ch + " ");
                }
                System.out.println();
            }

            System.out.println();
            return;
        }

        // Try every column
        for (int col = 0; col < N; col++) {

            if (isSafe(board, row, col)) {

                // Place Queen
                board[row][col] = 'Q';

                // Recur for next row
                solve(board, row + 1);

                // Backtracking
                board[row][col] = 'x';
            }
        }
    }
    static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Chess Board Size: ");
        N = sc.nextInt();

        char[][] board = new char[N][N];

        // Initialize board
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = 'x';
            }
        }

        System.out.println();

        solve(board, 0);

        sc.close();
    }
}