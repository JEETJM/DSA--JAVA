public class MergeSortString {

    // Merge Sort Function
    static void mergeSort(String arr[], int si, int ei) {

        // Base Case
        if (si >= ei) {
            return;
        }
        

        // Find Mid
        int mid = si + (ei - si) / 2;

        // Sort Left Half
        mergeSort(arr, si, mid);

        // Sort Right Half
        mergeSort(arr, mid + 1, ei);

        // Merge Both Halves
        merge(arr, si, mid, ei);
    }

    // Merge Function
    static void merge(String arr[], int si, int mid, int ei) {

        // Temporary Array
        String temp[] = new String[ei - si + 1];

        int i = si;        // Left Half
        int j = mid + 1;   // Right Half
        int k = 0;         // Temp Array

        while (i <= mid && j <= ei) {

            if (arr[i].compareTo(arr[j]) < 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Remaining Left Elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Remaining Right Elements
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy Temp into Original Array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {

        String arr[] = {"sun", "earth", "mars", "mercury"};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array :");

        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}