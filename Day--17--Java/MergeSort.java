public class MergeSort {

    // Merge Sort Function
    static void mergeSort(int arr[],
            int si,
            int ei) {

        // Base Case
        if (si >= ei) {
            return;
        }

        // Mid Calculation
        int mid = si + (ei - si) / 2;

        // Left Part
        mergeSort(arr, si, mid);

        // Right Part
        mergeSort(arr, mid + 1, ei);

        // Merge Both Parts
        merge(arr, si, mid, ei);
    }

    // Merge Function
    static void merge(int arr[],
            int si,
            int mid,
            int ei) {

        // Temporary Array
        int temp[] = new int[ei - si + 1];

        // Iterators
        int i = si; // left part
        int j = mid + 1; // right part
        int k = 0; // temp array

        // Compare and store smaller
        while (i <= mid && j <= ei) {

            if (arr[i] < arr[j]) {

                temp[k] = arr[i];

                i++;
            } else {

                temp[k] = arr[j];

                j++;
            }

            k++;
        }

        // Remaining Left Part
        while (i <= mid) {

            temp[k++] = arr[i++];
        }

        // Remaining Right Part
        while (j <= ei) {

            temp[k++] = arr[j++];
        }

        // Copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {

            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {

        int arr[] = { 152, 6, 1, 52, 12, 10, 3, 26, 320 };

        mergeSort(arr, 0, arr.length - 1);

        // Print Sorted Array
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}