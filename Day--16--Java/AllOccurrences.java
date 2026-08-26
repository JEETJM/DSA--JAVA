public class AllOccurrences {
// Find All Occurrences of a Key in Array using Recursion
    static void findAll(int arr[], int index, int key) {

        // Base Case
        if(index == arr.length) {
            return;
        }

        // Check current element
        if(arr[index] == key) {
            System.out.print(index + " ");
        }

        // Recursive Call
        findAll(arr, index + 1, key);
    }

    public static void main(String[] args) {

        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};

        int key = 2;

        findAll(arr, 0, key);
    }
}