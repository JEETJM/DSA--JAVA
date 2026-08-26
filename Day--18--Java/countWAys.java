public class countWAys {

    static int N = 4;
    static int count = 0; // Counts total solutions

    static boolean isSafe(char board[][], int row, int col) {

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

    static void solve(char board[][], int row) {

        // Base Case
        if (row == N) {

            count++; // Increase solution count

            System.out.println("Solution " + count + ":");

            for (char[] r : board) {
                for (char ch : r) {
                    System.out.print(ch + " ");
                }
                System.out.println();
            }

            System.out.println();
            return;
        }

        for (int col = 0; col < N; col++) {

            if (isSafe(board, row, col)) {

                // Place Queen
                board[row][col] = 'Q';

                // Recursive call
                solve(board, row + 1);

                // Backtracking
                board[row][col] = '.';
            }
        }
    }

    public static void main(String args[]) {

        char board[][] = new char[N][N];

        // Initialize board
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = '.';
            }
        }

        solve(board, 0);

        System.out.println("Total Number of Solutions = " + count);
    }
}