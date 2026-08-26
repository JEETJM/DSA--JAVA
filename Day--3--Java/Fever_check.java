// ✅ Question 2

// 👉 Complete the program:

// Print "You have a fever" if temperature > 100
// Otherwise print "You don't have a fever"

import java.util.Scanner;

public class Fever_check {
    public static void main(String[] args) {
        System.out.println("Please Enter Your Body Temp : ");
        Scanner sc = new Scanner(System.in);
        double Store_FEver = sc.nextDouble();
        if (Store_FEver > 100) {
            System.out.println("You have a High fever Please Go  For CheckUp");

        } else
            System.out.println("You don't have a fever");

        sc.close();
    }
}