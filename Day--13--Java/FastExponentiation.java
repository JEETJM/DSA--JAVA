import java.util.Scanner;

public class FastExponentiation {

    public static int fastExpo(int a, int n) {
        int ans = 1;

        while (n > 0) {
            // If last bit of n is 1
            if ((n & 1) != 0) {
                ans = ans * a;
            }

            // Square the base
            a = a * a;

            // Right shift n by 1 means n = n / 2
            n = n >> 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base a: ");
        int a = sc.nextInt();

        System.out.print("Enter power n: ");
        int n = sc.nextInt();

        int result = fastExpo(a, n);

        System.out.println(a + "^" + n + " = " + result);

        sc.close();
    }
}