import java.util.Scanner;

public class notAttackQueens {

    static int N;

    static void placeQueens(char[][] board, int row) {

        if (row == N) { //base case

            for (char[] r : board) {
                System.out.println(r);
            }

            System.out.println("-------- CHESS BOARD --------");
            return;
        }

        for (int col = 0; col < N; col++) {

            board[row][col] = 'Q';

            placeQueens(board, row + 1);

            board[row][col] = 'x'; // Backtrack
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Chess Board Size: ");
        N = sc.nextInt();

        char[][] board = new char[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = 'x';
            }
        }

        placeQueens(board, 0);

        sc.close();
    }
}