import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int store = sc.nextInt();

        if (store < 0) {
            System.out.println("Factorial not possible for negative numbers");
        } else {
            int fac = 1;

            for (int i = 1; i <= store; i++) {
                fac *= i;
            }

            System.out.println("Factorial = " + fac);
        }

        sc.close();
    }
}