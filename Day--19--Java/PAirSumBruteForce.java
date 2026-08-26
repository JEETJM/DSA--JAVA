import java.util.Scanner;

public class PAirSumBruteForce {

    static void pairSum(int arr[], int target) {

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {

                    System.out.println("Pair Found");
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);

                    found = true;
                    return;
                }
            }
        }

        if (!found) {
            System.out.println("Pair Not Found");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Elements:");
 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Target: ");
        int target = sc.nextInt();

        pairSum(arr, target);

        sc.close();
    }

}
