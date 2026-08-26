import java.util.Scanner;

public class EvenOdd_Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How Many Numbers You want to Enter: ");
        int num = sc.nextInt();

        int add_Even = 0;
        int add_Odd = 0;

        for (int i = 1; i <= num; i++) {
            System.out.print("Enter number " + i + ": ");
            int numbers_store = sc.nextInt();   // SAME scanner use

            if (numbers_store % 2 == 0) {
                add_Even += numbers_store;
            } else {
                add_Odd += numbers_store;
            }
        }

        System.out.println("Sum of Even Numbers: " + add_Even);
        System.out.println("Sum of Odd Numbers: " + add_Odd);

        sc.close();
    }
}