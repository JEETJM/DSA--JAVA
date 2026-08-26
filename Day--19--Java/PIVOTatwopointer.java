import java.util.Scanner;

public class PIVOTatwopointer {

    static boolean pairSum(int arr[], int target) {

        int n = arr.length;

        // Find Pivot
        int pivot = -1;

        for (int i = 0; i < n - 1; i++) { 
            

            if (arr[i] > arr[i + 1]) {

                pivot = i;
                break;
            }
        }

        int left = pivot + 1; // Smallest element
        int right = pivot; // Largest element

        while (left != right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {

                System.out.println("Pair Found");
                System.out.println(arr[left] + " + " + arr[right] + " = " + target);

                return true;
            }

            if (sum < target) {

                left = (left + 1) % n;
            }

            else {

                right = (n + right - 1) % n;
            }
        }

        return false;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 11, 15, 6, 8, 9, 10 };

        System.out.print("Enter Target: ");
        int target = sc.nextInt();

        if (!pairSum(arr, target)) {

            System.out.println("Pair Not Found");
        }

        sc.close();
    }
}
