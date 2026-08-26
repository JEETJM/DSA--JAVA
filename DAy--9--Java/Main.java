import java.util.*;

public class Main {

    public static int search(int[] nums, int target) {
        int min = minSearch(nums);

        if (nums[min] <= target && target <= nums[nums.length - 1]) {
            return binarySearch(nums, min, nums.length - 1, target);
        } else {
            return binarySearch(nums, 0, min - 1, target);
        }
    }

    public static int binarySearch(int[] nums, int left, int right, int target) {
        int l = left;
        int r = right;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1;
    }

    public static int minSearch(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter rotated sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int result = search(nums, target);

        System.out.println("Target index = " + result);

        sc.close();
    }
}