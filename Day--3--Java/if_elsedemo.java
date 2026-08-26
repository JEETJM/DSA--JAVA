// package DSA--JAVA.Day--3--Java;

import java.util.Scanner;

public class if_elsedemo {
    public static void main(String[] args) {
        System.out.print("Enter Your Age :");
        Scanner sc = new Scanner(System.in);
        int age_Store = sc.nextInt();
        if (age_Store >= 18) {
            System.out.print("Congratulations You Are eligable for vote Adult Man !!");

        }
        if (age_Store > 13 && age_Store < 18) {
            System.out.print("Teenager");
        }

        else
            System.out.print("So sad Baby now u are !! Go home ");
        sc.close();
    }

}
