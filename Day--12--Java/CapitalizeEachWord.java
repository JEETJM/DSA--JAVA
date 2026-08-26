import java.util.Scanner;

public class CapitalizeEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);

        // First letter of sentence should be capital
        boolean capitalizeNext = true;

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            // If current character is space, next letter should be capital
            if (ch == ' ') {
                capitalizeNext = true;
            } 
            else if (capitalizeNext) {
                sb.setCharAt(i, Character.toUpperCase(ch));
                capitalizeNext = false;
            } 
            else {
                sb.setCharAt(i, Character.toLowerCase(ch));
            }
        }

        System.out.println("Capitalized Sentence: " + sb);

        sc.close();
    }
}