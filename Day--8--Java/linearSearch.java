import java.util.Scanner;

public class linearSearch {

    // Function
    public static int valueSearch(int srchArray[], int key) {
        for (int i = 0; i < srchArray.length; i++) {
            if (srchArray[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of the Array: ");
        int size = sc.nextInt();

        int srchArray[] = new int[size];   // array creation

        // Input array elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value at position " + i + ": ");
            srchArray[i] = sc.nextInt();
        }

        System.out.print("Enter the Key value: ");
        int store_key = sc.nextInt();

        int index = valueSearch(srchArray, store_key);  // function call

        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at index: " + index);
        }

        sc.close();
    }
}