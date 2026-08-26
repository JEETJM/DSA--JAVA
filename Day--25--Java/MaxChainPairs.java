import java.util.*;

public class MaxChainPairs {

    public static void main(String[] args) {

        int pairs[][] = {
                { 5, 24 },
                { 39, 60 },
                { 5, 28 },
                { 27, 40 },
                { 50, 90 }
        };

        // Sort according to second element
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);

        int count = 1;

        int lastEnd = pairs[0][1];

        System.out.println(
                "Selected Pair: (" +
                        pairs[0][0] + ", " +
                        pairs[0][1] + ")");

        for (int i = 1; i < pairs.length; i++) {

            int start = pairs[i][0];
            int end = pairs[i][1];

            if (start > lastEnd) {

                count++;

                lastEnd = end;

                System.out.println(
                        "Selected Pair: (" +
                                start + ", " +
                                end + ")");
            }
        }

        System.out.println(
                "Maximum Chain Length = " + count);
    }
}