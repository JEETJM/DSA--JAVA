import java.util.*;

public class ActivitySolution_Greedy {

    public static void main(String[] args) {

        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        int n = start.length;

        // Store activity index
        Integer activity[] = new Integer[n];

        for (int i = 0; i < n; i++) {
            activity[i] = i;
        }

        // Sort according to ending time
        Arrays.sort(activity, (a, b) -> end[a] - end[b]);

        int count = 1;

        int lastEnd = end[activity[0]];

        System.out.println("Selected Activity: " + activity[0]);

        for (int i = 1; i < n; i++) {

            int current = activity[i];

            if (start[current] >= lastEnd) {

                count++;

                lastEnd = end[current];

                System.out.println("Selected Activity: " + current);
            }
        }

        System.out.println("Maximum Activities = " + count);
    }
}