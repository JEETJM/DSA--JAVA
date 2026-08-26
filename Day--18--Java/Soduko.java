public class Soduko {

    static final int N = 9;

    // Check if placing num is safe
    static boolean isSafe(int[][] board, int row, int col, int num) {

        // Check row
        for (int j = 0; j < N; j++) {
            if (board[row][j] == num)
                return false;
        }

        // Check column
        for (int i = 0; i < N; i++) {
            if (board[i][col] == num)
                return false;
        }

        // Check 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num)
                    return false;
            }
        }

        return true;
    }

    // Solve Sudoku
    static boolean solveSudoku(int[][] board) {

        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {

                // Empty cell found
                if (board[row][col] == 0) {

                    // Try numbers 1 to 9
                    for (int num = 1; num <= 9; num++) {

                        if (isSafe(board, row, col, num)) {

                            // Place number
                            board[row][col] = num;

                            // Recur
                            if (solveSudoku(board))
                                return true;

                            // Backtrack
                            board[row][col] = 0;
                        }
                    }

                    // No number fits
                    return false;
                }
            }
        }

        // Puzzle solved
        return true;
    }

    // Print board
    static void printBoard(int[][] board) {

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] board = {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };

        if (solveSudoku(board)) {
            System.out.println("Solved Sudoku:");
            printBoard(board);
        } else {
            System.out.println("No Solution Exists.");
        }
    }
}