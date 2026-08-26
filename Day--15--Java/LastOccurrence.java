import java.util.Scanner;

public class LastOccurrence {

    static int lastOcc(int arr[], int index, int key) {

        // Base Case
        if(index == arr.length) {
            return -1;
        }

        // Recursive Call
        int found = lastOcc(arr, index + 1, key);

        // If found later, return it
        if(found != -1) {
            return found;
        }

        // Check current index
        if(arr[index] == key) {
            return index;
        }

        return -1;
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
        int ans = lastOcc(arr, 0, key);

        // Output
        if(ans == -1) {
            System.out.println("Key Not Found");
        }
        else {
            System.out.println("Last Occurrence at index : " + ans);
        }

        sc.close();
    }
}