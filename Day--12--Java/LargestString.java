import java.util.Scanner;

public class LargestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of fruits: ");
        int n = sc.nextInt();
        sc.nextLine(); // buffer clear

        String[] fruits = new String[n];

        System.out.println("Enter fruit names:");
        for (int i = 0; i < n; i++) {
            System.out.print("Fruit " + (i + 1) + ": ");
            fruits[i] = sc.nextLine();
        }

        String largest = fruits[0];

        for (int i = 1; i < n; i++) {
            // if (fruits[i].compareTo(largest) > 0) { 
            if (fruits[i].compareToIgnoreCase(largest) > 0) {

                largest = fruits[i];
            }
        }

        System.out.println("\nLargest String is: " + largest);

        sc.close();
    }
}