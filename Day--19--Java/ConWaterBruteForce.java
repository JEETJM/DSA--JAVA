import java.util.Scanner;

public class ConWaterBruteForce {

    // public class Main {

    // Function to find maximum water
    static int maxWater(int[] height) {
        
        int maxArea = 0;

        // Check every possible pair
        for (int i = 0; i < height.length; i++) {

            for (int j = i + 1; j < height.length; j++) {

                int width = j - i;
                int minHeight = Math.min(height[i], height[j]);
                int area = width * minHeight;

                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Heights: ");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("Enter Heights:");

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int ans = maxWater(height);

        System.out.println("Maximum Water = " + ans);

        sc.close();
    }
}
