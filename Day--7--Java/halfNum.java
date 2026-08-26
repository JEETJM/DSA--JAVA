// package DSA--JAVA.Day--7--Java.inv;

import java.util.Scanner;

public class halfNum {
    public static void inhapyNu(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i+1; j++) {
                System.out.print(j);
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int Store = sc.nextInt();
        inhapyNu(Store);
        sc.close();
    }

}
