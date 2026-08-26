
// package DSA--JAVA.Day--5--Java;
import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        System.out.print("Enter number of Outer loop : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            // one line
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }
            System.out.println();

        }
        sc.close();
    }

}
