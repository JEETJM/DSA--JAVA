// package DSA--JAVA.Day--5--Java;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        System.out.print("Enter the number of stars :");
        Scanner sc = new Scanner(System.in);
        int stars = sc.nextInt();
        for (int i = 1; i <= stars; i++) {
            for (int j = 1; j <= stars-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
