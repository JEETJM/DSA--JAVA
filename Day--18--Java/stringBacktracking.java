import java.util.Scanner;

public class stringBacktracking { 
    // public class Main {

    static void findSubsets(String str, int index, StringBuilder current) {

        // Base case
        if (index == str.length()) {
            System.out.println(current.toString());
            return;
        }

        // Include current character
        current.append(str.charAt(index));
        findSubsets(str, index + 1, current);

        // Backtrack
        current.deleteCharAt(current.length() - 1);

        // Exclude current character
        findSubsets(str, index + 1, current);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        // String str = "ABC";

        findSubsets(str, 0, new StringBuilder());
        sc.close();
    }

}
