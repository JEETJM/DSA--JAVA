
import java.util.Stack;

public class NextGreaterEL {

    static void nextGreater(int arr[], int result[]) {

        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            // Remove smaller/equal elements
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            // Find answer
            if (s.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = s.peek();
            }

            // Push current element
            s.push(arr[i]);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 6, 8, 0, 1, 3 };

        int result[] = new int[arr.length];

        nextGreater(arr, result);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}