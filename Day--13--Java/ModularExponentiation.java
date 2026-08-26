import java.util.Scanner;

public class ModularExponentiation {

    public static long modExpo(long a, long n, long mod) {
        long ans = 1;

        a = a % mod;

        while (n > 0) {
            if ((n & 1) != 0) {
                ans = (ans * a) % mod;
            }

            a = (a * a) % mod;
            n = n >> 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base a: ");
        long a = sc.nextLong();

        System.out.print("Enter power n: ");
        long n = sc.nextLong();

        System.out.print("Enter mod: ");
        long mod = sc.nextLong();

        long result = modExpo(a, n, mod);

        System.out.println("(" + a + "^" + n + ") % " + mod + " = " + result);

        sc.close();
    }
}