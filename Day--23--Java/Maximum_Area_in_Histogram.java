import java.util.Stack;

public class Maximum_Area_in_Histogram {

    static int maxArea(int heights[]) {

        Stack<Integer> s = new Stack<>();

        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {

            int currentHeight;

            if (i == heights.length) {
                currentHeight = 0;
            } else {
                currentHeight = heights[i];
            }

            while (!s.isEmpty()
                    && currentHeight < heights[s.peek()]) {

                int height = heights[s.pop()];

                int width;

                if (s.isEmpty()) {
                    width = i;
                } else {
                    width = i - s.peek() - 1;
                }

                int area = height * width;

                maxArea = Math.max(maxArea, area);
            }

            s.push(i);
        }

        return maxArea;
    }

    public static void main(String[] args) {

        int heights[] = { 2, 1, 5, 6, 2, 3 };

        System.out.println("Maximum Area in Histogram = " + maxArea(heights));
    }
}