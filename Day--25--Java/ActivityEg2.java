public class ActivityEg2 {

    public static void main(String[] args) {

        int start[] = { 10, 12, 20 };
        int end[] = { 20, 25, 30 };

        int count = 1;

        int lastEnd = end[0];

        for (int i = 1; i < start.length; i++) {

            if (start[i] >= lastEnd) {

                count++;

                lastEnd = end[i];
            }
        }

        System.out.println("Maximum Activities = " + count);
    }
}