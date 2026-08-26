// package DSA--JAVA.Day--18--Java;

public class Backtracking1 {
    public static void changeArray(int arr[], int i, int val) {
        // base-----#case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // recursion ##
        arr[i] = val;
        changeArray(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        changeArray(arr, 0, 1);
        // System.err.println();
        printArr(arr);
    }

}
