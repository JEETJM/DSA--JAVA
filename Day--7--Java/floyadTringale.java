// pack/age DSA--JAVA.Day--7--Java;

import java.util.Scanner;

public class floyadTringale {

    public static void floyadTria(int n) {
        int count= 1 ;
        for (int i = 1; i <= n; i++) {
            // System.out.print(i);
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
                // j++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int store = sc.nextInt();
        floyadTria(store);
        sc.close();
    }
}
