// package DSA--JAVA.Day--4--Java;

import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {

        System.out.print("Enter Number of Print : ");
        Scanner sc = new Scanner(System.in);
        int Counter = sc.nextInt();
        int i = 0;
        while (i < Counter) {
            System.out.println("HElLO World");
            i++;
        }

        sc.close();
    }

}
