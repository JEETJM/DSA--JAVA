import java.util.Scanner;

public class isEvenTest {

    public static boolean isEvenNum(int n) {

        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        boolean result = isEvenNum(num);

        if (result) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }

        sc.close();
    }
}