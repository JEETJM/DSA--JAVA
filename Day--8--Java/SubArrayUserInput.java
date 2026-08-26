import java.util.*;

public class SubArrayUserInput {

    // Function
    public static void printSubArrays(int arr[]) {

        int totalSubArrays = 0;

        for (int i = 0; i < arr.length; i++) {      // start

            for (int j = i; j < arr.length; j++) {  // end

                for (int k = i; k <= j; k++) {      // print
                    System.out.print(arr[k] + " ");
                }

                totalSubArrays++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total Subarrays = " + totalSubArrays);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // size input
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // array input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // function call
        printSubArrays(arr);

        sc.close();
    }
}