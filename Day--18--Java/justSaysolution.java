public class justSaysolution {

    static int N = 4;

    static boolean isSafe(char[][] board, int row, int col) {

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // Upper Left Diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {

            if (board[i][j] == 'Q')
                return false;
        }

        // Upper Right Diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++) {

            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    // Returns true if a solution is found
    static boolean solve(char[][] board, int row) {

        // Base Case
        if (row == N) {
            return true;
        }

        for (int col = 0; col < N; col++) {

            if (isSafe(board, row, col)) {

                // Place Queen
                board[row][col] = 'Q';

                // If solution found, stop recursion
                if (solve(board, row + 1))
                    return true;

                // Backtrack
                board[row][col] = '.';
            }
        }

        return false;
    }

    static void printBoard(char[][] board) {

        for (char[] r : board) {
            for (char ch : r) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        char[][] board = new char[N][N];

        // Initialize board
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = '.';
            }
        }

        if (solve(board, 0)) {
            System.out.println("Solution Exists:");
            printBoard(board);
        } else {
            System.out.println("No Solution Exists.");
        }
    }
}