import java.util.*;

public class ReverseArray {

    // Function to reverse array
    public static void reverse(int arr[]) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            // // swap
            // int temp = arr[start];
            // arr[start] = arr[end];
            // arr[end] = temp;

            // start++;
            // end--;

            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // Input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Function call
        reverse(arr);

        // Output
        System.out.println("Reversed Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}