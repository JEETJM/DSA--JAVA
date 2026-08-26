import java.util.*;

public class MinAbsoluteDifference {

    public static void main(String[] args) {

        int A[] = { 4, 1, 8, 7 };
        int B[] = { 2, 3, 6, 5 };

        // Sort both arrays
        Arrays.sort(A);
        Arrays.sort(B);

        int minSum = 0;

        // Pair same index elements
        for (int i = 0; i < A.length; i++) {

            minSum += Math.abs(A[i] - B[i]);
        }

        System.out.println("Minimum Sum = " + minSum);
    }
}