import java.util.*;

public class PairsInArray {

    // Function
    public static void printPairs(int arr[]) {

        int totalPairs = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                totalPairs++;
            }

            System.out.println();
        }

        System.out.println("Total Pairs = " + totalPairs);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Size input
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // Array input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Function call
        printPairs(arr);

        sc.close();
    }
}