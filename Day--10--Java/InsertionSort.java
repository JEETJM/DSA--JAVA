import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];   // element to insert
            int j = i - 1;

            // shift elements to right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // place key at correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        insertionSort(arr);

        System.out.print("Sorted Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}