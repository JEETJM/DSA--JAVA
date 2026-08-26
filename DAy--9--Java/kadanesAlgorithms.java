import java.util.*;

public class kadanesAlgorithms {

    public static void kadanesAlgorithm(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }

            if (currSum < 0) {
                currSum = 0;
                tempStart = i + 1;
            }
        }

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

        kadanesAlgorithm(arr);

        sc.close();
    }
}