import java.util.Scanner;

public class holloRec {

    public static void hollowRect(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Row: ");
        int row_store = sc.nextInt();

        System.out.print("Enter Column: ");
        int col_store = sc.nextInt();

        hollowRect(row_store, col_store);

        sc.close();
    }
}