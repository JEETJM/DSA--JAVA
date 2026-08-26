public class SortedArray {

    static boolean isSorted(int arr[], int index) {

        // Base Case
        if(index == arr.length - 1) {
            return true;
        }

        // Check current element with next
        if(arr[index] > arr[index + 1]) {
            return false;
        }

        // Recursive Call
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};

        boolean ans = isSorted(arr, 0);

        System.out.println(ans);
    }
}