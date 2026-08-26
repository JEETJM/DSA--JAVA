
// package DSA--JAVA.Day--4--Java;

import java.util.Scanner;

public class breakStatement {

    // public class For_Loop {
    public static void main(String[] args) {
        System.out.print("Enter Your Number to Print : ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        sc.close();
    }

}
