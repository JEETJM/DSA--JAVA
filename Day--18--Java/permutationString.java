import java.util.Scanner;

public class permutationString {

    static void permutation(String str, String current, boolean[] used) {

        // Base Case
        if (current.length() == str.length()) {
            System.out.println(current);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            if (used[i])
                continue;

            // Choose
            used[i] = true;
            current += str.charAt(i);

            // Explore
            permutation(str, current, used);

            // Backtrack
            current = current.substring(0, current.length() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        boolean used[] = new boolean[str.length()];

        permutation(str, "", used);
        sc.close();
    }
}