import java.util.*;

public class TrappingRainwater {

    public static int trapRainwater(int height[]) {
        int n = height.length;

        if (n <= 2) return 0;

        // left max
        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // right max
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // trapped water
        int water = 0;

        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            water += (waterLevel - height[i]);   // width = 1
        }

        return water;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of buildings: ");
        int n = sc.nextInt();

        int height[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height of building " + i + ": ");
            height[i] = sc.nextInt();
        }

        int result = trapRainwater(height);

        System.out.println("Total Trapped Water = " + result + " units");

        sc.close();
    }
}