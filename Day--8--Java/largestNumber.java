import java.util.*;

public class largestNumber {

    // Function
    public static int largestN(int orgArr[]) {

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < orgArr.length; i++) {
            if (largest < orgArr[i]) {
                largest = orgArr[i];
            }
        }

        return largest;
    } 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array size input
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // Array input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Function call
        int result = largestN(arr);

        // Output
        System.out.println("Largest Number is: " + result);

        sc.close();
    }
}