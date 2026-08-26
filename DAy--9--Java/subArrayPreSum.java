import java.util.*;

public class subArrayPreSum {

    public static void maxSubArrayPrefix(int arr[]) {

        int n = arr.length;

        // prefix array
        int prefix[] = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;
        int start = 0, end = 0;

        // calculate subarray sum using prefix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int currSum;

                if (i == 0) {
                    currSum = prefix[j];
                } else {
                    currSum = prefix[j] - prefix[i - 1];
                }

                if (currSum > maxSum) {
                    maxSum = currSum;
                    start = i;
                    end = j;
                }
            }
        }

        // output
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

        maxSubArrayPrefix(arr);

        sc.close();
    }
}