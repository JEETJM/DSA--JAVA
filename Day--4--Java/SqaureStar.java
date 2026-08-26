// package DSA--JAVA.Day--4--Java;

import java.util.Scanner;

public class SqaureStar {
    public static void main(String[] args) {
        System.out.print("Enter the line of Stars : ");
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        for (int i = 1; i <= lines; i++) {
            System.out.print("****\n");
            // System.out.println(" ");
        }
        // System.out.println("\n");
        sc.close();
    }

}
