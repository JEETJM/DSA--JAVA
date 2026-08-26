public class LinearSearchString {

    // Function
    public static int linearSearch(String arr[], String key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {   // IMPORTANT for String
                return i;               // return index
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {

        String arr[] = {"Jeet", "Rahul", "Amit", "Suman"};

        String key = "Amit";

        int result = linearSearch(arr, key);

        if (result == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at index: " + result);
        }
    }
}