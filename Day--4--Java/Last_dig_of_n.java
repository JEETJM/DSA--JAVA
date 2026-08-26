import java.util.Scanner;

public class Last_dig_of_n {
    public static void main(String[] args) {

        System.out.print("Enter a Number Which Number You Want to Reverse : ");
        Scanner sc = new Scanner(System.in);

        int store = sc.nextInt();

        while (store > 0) {
            int lastDigit = store % 10;
            System.out.print(lastDigit);
            store = store / 10;
        }

        System.out.println();
        sc.close();
    }
}