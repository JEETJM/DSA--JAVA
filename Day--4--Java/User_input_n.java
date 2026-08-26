// package DSA--JAVA.Day--4--Java;

import java.util.Scanner;

public class User_input_n {
    public static void main(String[] args) {
        System.out.print("Enter Your Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        while (i <= num) {
            System.out.print(i + " ");
            i++;
        }
        sc.close();
    }

}
