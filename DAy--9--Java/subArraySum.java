import java.util.*;

public class subArraySum {

    public static void printSubArrays(int arr[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int start = 0;
        int end = 0;

        // loops
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                currSum = 0;

                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }

                // update max
                if (currSum > maxSum) {
                    maxSum = currSum;
                    start = i;
                    end = j;
                }
            }
        }

        // print result
        System.out.println("Maximum Sum = " + maxSum);

        System.out.print("Subarray = ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        printSubArrays(arr);

        sc.close();
    }
}