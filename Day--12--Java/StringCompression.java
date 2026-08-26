import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            // Count same continuous characters
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // Add character 
            result.append(str.charAt(i));

            // Add count only if count > 1
            if (count > 1) {
                result.append(count);
            }
        }

        System.out.println("Compressed String: " + result);

        sc.close();
    }
}