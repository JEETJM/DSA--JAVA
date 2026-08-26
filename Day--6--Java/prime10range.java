// import java.util.Scanner;

// public class prime10range {

//     // Prime check function
//     public static boolean isPrime(int n) {
//         if (n <= 1) return false;

//         for (int i = 2; i <= Math.sqrt(n); i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     // Print primes from 2 to n
//     public static void PrimeNumbr(int n) {
//         for (int i = 2; i <= n; i++) {
//             if (isPrime(i)) {
//                 System.out.print(i + " ");
//             }
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         System.out.print("Enter the Number  : ");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         PrimeNumbr(num);   // just call, no println
//     }
//     // sc.close();
// }