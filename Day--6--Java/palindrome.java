import java.util.Scanner;

public class palindrome {

    public static boolean paliDr(int n) {

        int original = n;
        int rev = 0;

        while (n > 0) {
            int lastDig = n % 10;
            rev = rev * 10 + lastDig;
            n = n / 10;
        }

        if (original == rev) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int store = sc.nextInt();

        boolean result = paliDr(store);

        if (result) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}

// import java.util.Scanner;

// public class PalindromeBoth {

// public static boolean isPalindrome(String str) {
// String rev = "";

// for (int i = str.length() - 1; i >= 0; i--) {
// rev = rev + str.charAt(i);
// }

// return str.equals(rev);
// }

// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);

// System.out.print("Enter String or Number: ");
// String input = sc.nextLine();

// if (isPalindrome(input)) {
// System.out.println("Palindrome");
// } else {
// System.out.println("Not a Palindrome");
// }

// sc.close();
// }
// }