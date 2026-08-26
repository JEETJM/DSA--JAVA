public class TwopointerWater {

    static int maxWater(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {

            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {

        int[] height = { 10, 20, 30, 40, 50, 60, 70, 80 };

        System.out.println("Maximum Water = " + maxWater(height));
    }
}