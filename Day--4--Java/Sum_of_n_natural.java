// package DSA--JAVA.Day--4--Java;

import java.util.Scanner;

public class Sum_of_n_natural {
    public static void main(String[] args) {
        System.out.print("Enter number to want to sum : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;
        // int Result;
        while (i <= num) {
            sum += i;
            i++;

        }
        System.out.print(sum);
        sc.close();
    }
}
