import java.util.Scanner;

public class SearchMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] mat = new int[r][c];

        System.out.println("Enter matrix elements:");

        // Input matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        boolean found = false;

        // Searching
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == key) {
                    System.out.println("Key found at position: (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Key not found");
        }

        sc.close();
    }
}