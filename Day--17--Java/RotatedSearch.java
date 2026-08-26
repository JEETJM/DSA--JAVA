public class RotatedSearch {

    static int search(int arr[],
            int si,
            int ei,
            int key) {

        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        // Found
        if (arr[mid] == key) {
            return mid;
        }

        // Left Half Sorted
        if (arr[si] <= arr[mid]) {

            if (arr[si] <= key &&
                    key <= arr[mid]) {

                return search(arr,
                        si,
                        mid - 1,
                        key);
            }

            else {

                return search(arr,
                        mid + 1,
                        ei,
                        key);
            }
        }

        // Right Half Sorted
        else {

            if (arr[mid] <= key &&
                    key <= arr[ei]) {

                return search(arr,
                        mid + 1,
                        ei,
                        key);
            }

            else {

                return search(arr,
                        si,
                        mid - 1,
                        key);
            }
        }

    }

    public static void main(String args[]) {

        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };

        int key = 7;

        int ans = search(arr,
                0,
                arr.length - 1,
                key);

        System.out.println("The Actual searching Key index is : " + ans);

    }

}