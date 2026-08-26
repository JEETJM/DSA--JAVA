import java.util.Scanner;

public class Diamondpattern {
    public static void diaMond(int n) {

        // Upper part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower part \
        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int store = sc.nextInt();
        diaMond(store);
        sc.close();
    }
}