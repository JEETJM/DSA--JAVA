import java.util.Scanner;

public class SubstringUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Print string length and indexes
        System.out.println("\nYour String: " + str);
        System.out.println("String Length: " + str.length());

        System.out.println("\nIndex positions:");
        for (int i = 0; i < str.length(); i++) {
            System.out.println("Index " + i + " = " + str.charAt(i));
        }

        // Take start and end index
        System.out.print("\nEnter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Validate indexes
        if (start < 0 || end > str.length() || start > end) {
            System.out.println("\nInvalid index input!");
            System.out.println("Rules:");
            System.out.println("Start index must be >= 0");
            System.out.println("End index must be <= string length");
            System.out.println("Start index must be <= end index");
        } else {
            String result = str.substring(start, end);
            System.out.println("\nSubstring = " + result);
        }

        sc.close();
    }
}