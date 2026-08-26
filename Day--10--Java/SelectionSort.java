import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i; // assume current is minimum

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // update min index
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
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

        selectionSort(arr);

        System.out.print("Sorted Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}