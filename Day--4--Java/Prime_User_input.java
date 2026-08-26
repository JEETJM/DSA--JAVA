// import java.util.Scanner;

// public class Prime_User_input {
//     public static void main(String[] args) {

//         System.out.print("Enter a Number to check Prime or Not : ");
//         Scanner sc = new Scanner(System.in);

//         int num = sc.nextInt();
//         boolean isPrime = true;

//         if (num <= 1) {
//             isPrime = false;
//         } else {
//             for (int i = 2; i <= num / 2; i++) {
//                 if (num % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }

//         if (isPrime) {
//             System.out.println("Prime Number");
//         } else {
//             System.out.println("Not a Prime Number");
//         }

//         sc.close();
//     }
// }

import java.util.Scanner;

public class Prime_User_input {
    public static void main(String[] args) {

        System.out.print("Enter a Number to check Prime or Not : ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

        sc.close();
    }
}