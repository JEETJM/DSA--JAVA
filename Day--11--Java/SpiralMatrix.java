import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows:");
        int row = sc.nextInt();

        System.out.println("Enter columns:");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter matrix elements:");

        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Spiral order is:");

        int top = 0;
        int bottom = row - 1;
        int left = 0;
        int right = col - 1;

        while (top <= bottom && left <= right) {

            // left to right
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            // top to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

            // bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }

        sc.close();
    }
}