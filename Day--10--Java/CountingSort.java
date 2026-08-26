import java.util.*;

public class CountingSort {

    public static void countingSort(int arr[]) {

        int n = arr.length;

        // Step 1: Find max
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 2: Create count array
        int count[] = new int[max + 1];

        // Step 3: Count frequency
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Step 4: Prefix sum
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Step 5: Output array
        int output[] = new int[n];

        // Step 6: Place elements
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy back
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Sorting
        countingSort(arr);

        // Output
        System.out.println("Sorted Array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}