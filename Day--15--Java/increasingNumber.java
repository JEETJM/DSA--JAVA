import java.util.Scanner;

public class increasingNumber {

    static void increaseNum(int n) {

        if (n == 1) {
            System.out.println(n);
            return;
        }

        increaseNum(n - 1);

        System.out.println(n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");

        int store = sc.nextInt();

        increaseNum(store);

        sc.close();
    }
}