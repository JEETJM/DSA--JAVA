import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking string input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to lowercase to ignore case
        str = str.toLowerCase();

        // Remove spaces
        str = str.replace(" ", "");

        String reversed = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        // Check palindrome
        if (str.equals(reversed)) {
            System.out.println("The string is Palindrome.");
        } else {
            System.out.println("The string is Not Palindrome.");
        }

        sc.close();
    }
}