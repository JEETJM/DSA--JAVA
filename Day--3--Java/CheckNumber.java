
// ✅ Question 1

// 👉 Write a Java program to check whether a number is:

// Positive
// Negative
// Zero

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Checking condition
        if (num > 0) {
            System.out.println("Positive number");
        } else if (num < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}