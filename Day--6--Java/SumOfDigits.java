import java.util.Scanner;

public class SumOfDigits {

    // Method to compute sum of digits
    public static int sumDigits(int number) {
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;   // last digit ber kora
            sum = sum + digit;         // sum e add kora
            number = number / 10;      // last digit remove kora
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = sumDigits(num);

        System.out.println("Sum of digits = " + result);

        sc.close();
    }
}