import java.util.Scanner;

public class FirstNnaturalN {

    static int sum(int n) {

        if (n == 0 || n == 1)
            return 1;

        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");

        int n = sc.nextInt();

        int ans = sum(n);

        System.out.println("sum of n natural number is   " + ans);

        sc.close();
    }
}
