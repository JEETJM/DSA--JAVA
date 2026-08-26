import java.util.*;

public class BinarySearch {

    // Function
    public static int binarySearch(int arr[], int key) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;   // found
            } else if (arr[mid] < key) {
                start = mid + 1;   // right side
            } else {
                end = mid - 1;     // left side
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter sorted array elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter key: ");
        int key = sc.nextInt();

        int result = binarySearch(arr, key);

        if (result == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at index: " + result);
        }

        sc.close();
    }
}