import java.util.Scanner;

public class OptimizedPower {

    static int power(int x, int n) {

        // Base Case
        if(n == 0) {
            return 1;
        }

        // Recursive Call
        int halfPower = power(x, n / 2);

        // Square
        int halfPowerSq = halfPower * halfPower;

        // If n is odd
        if(n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x : ");
        int x = sc.nextInt();

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int ans = power(x, n);

        System.out.println("Answer = " + ans);

        sc.close();
    }
}