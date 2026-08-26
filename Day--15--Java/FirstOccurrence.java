import java.util.Scanner;

public class FirstOccurrence {

    static int firstOcc(int arr[], int index, int key) {

        // Base Case
        if(index == arr.length) {
            return -1;
        }

        // Check current element
        if(arr[index] == key) {
            return index;
        }

        // Recursive Call
        return firstOcc(arr, index + 1, key);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // Input Array
        System.out.println("Enter Array Elements : ");

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Input Key
        System.out.print("Enter Key : ");
        int key = sc.nextInt();

        // Function Call
        int ans = firstOcc(arr, 0, key);

        // Output
        if(ans == -1) {
            System.out.println("Key Not Found");
        }
        else {
            System.out.println("First Occurrence at index : " + ans);
        }

        sc.close();
    }
}