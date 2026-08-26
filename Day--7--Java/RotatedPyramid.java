// package DSA--JAVA.Day--7--Java;

import java.util.Scanner;

public class RotatedPyramid {
    public static void rotetedPyra(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row : ");
        int rowPass = sc.nextInt();
        rotetedPyra(rowPass);
        sc.close();
    }

}
