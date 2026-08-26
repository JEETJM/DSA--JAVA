import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        // Convert both strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Remove spaces
        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
        } else {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }

        sc.close();
    }
}