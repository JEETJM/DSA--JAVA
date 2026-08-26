
import java.util.Scanner;

public class PAirSumTwopointer {

    static void pairSum(int arr[], int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {

                System.out.println("Pair Found");
                System.out.println(arr[left] + " + " + arr[right] + " = " + target);
                return;
            }

            else if (sum < target) {
                left++;
            }

            else {
                right--;
            }
        }

        System.out.println("Pair Not Found");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Sorted Array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Target: ");
        int target = sc.nextInt();

        pairSum(arr, target);

        sc.close();
    }
}
