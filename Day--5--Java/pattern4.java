
// package DSA--JAVA.Day--5--Java;
import java.util.Scanner;

public class pattern4 {

    // package DSA--JAVA.Day--5--Java;

    public static void main(String[] args) {
        System.out.print("Enter number of Outer loop : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char ch = 'A';
        for (int i = 1; i <= num; i++) {
            // one line
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;

            }
            System.out.println();

        }
        sc.close();
    }

}
