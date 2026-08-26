import java.util.Scanner;

public class Power {

    static int power(int x, int n) {

        // Base Case
        if(n == 0) {
            return 1;
        }

        // Recursive Call
        return x * power(x, n - 1);
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