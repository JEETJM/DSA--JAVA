public class CallByRefFunction {

    // Function to modify array
    static void changeValues(int[] arr) {
        System.out.println("Inside function (before change): " + arr[0]);

        arr[0] = 999;   // changing value

        System.out.println("Inside function (after change): " + arr[0]);
    }

    public static void main(String[] args) {

        int[] myArray = {10, 20, 30};

        System.out.println("Before function call: " + myArray[0]);

        // Function call
        changeValues(myArray);

        System.out.println("After function call: " + myArray[0]);
    }
}