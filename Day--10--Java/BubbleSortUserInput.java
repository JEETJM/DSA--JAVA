import java.util.Scanner;

public class BubbleSortUserInput {

    // Bubble Sort Function
    public static void bubbleSort(int arr[]) {
        int n = arr.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparison
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Print Array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Size input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Array input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Original Array: ");
        printArray(arr);

        // Sorting
        bubbleSort(arr);

        System.out.print("Sorted Array: ");
        printArray(arr);

        sc.close();
    }
}













// import java.util.Scanner;

// public class BubbleSortOptimized {

//     public static void bubbleSort(int arr[]) {
//         int n = arr.length;

//         for (int i = 0; i < n - 1; i++) {

//             boolean swapped = false; // check swap

//             for (int j = 0; j < n - i - 1; j++) {

//                 if (arr[j] > arr[j + 1]) {
//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;

//                     swapped = true;
//                 }
//             }

//             // if no swap → already sorted
//             if (!swapped) {
//                 break;
//             }
//         }
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             System.out.print("Enter element " + i + ": ");
//             arr[i] = sc.nextInt();
//         }

//         bubbleSort(arr);

//         System.out.print("Sorted Array: ");
//         for (int x : arr) {
//             System.out.print(x + " ");
//         }

//         sc.close();
//     }
// }