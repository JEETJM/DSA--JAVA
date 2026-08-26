import java.util.Scanner;

public class Fibonacci {

    static int fib(int n) {

        // Base Cases
        if(n == 0)
            return 0;

        if(n == 1)
            return 1;

        // Recursive Call  *************************** MOST IMPORTANT FORMULA TO BE NEED TO REMEMBER IS NEDDED !!@
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms : ");

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {

            System.out.print(fib(i) + " ");
        }

        sc.close();
    }
}