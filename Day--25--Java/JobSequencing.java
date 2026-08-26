import java.util.*;

public class JobSequencing {

    static class Job {
        String id;
        int deadline;
        int profit;

        Job(String id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {

        Job jobs[] = {
                new Job("J1", 2, 100),
                new Job("J2", 1, 19),
                new Job("J3", 2, 27),
                new Job("J4", 1, 25),
                new Job("J5", 3, 15)
        };

        // Sort jobs by decreasing profit
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Find maximum deadline
        int maxDeadline = 0;

        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        // Slots
        String slot[] = new String[maxDeadline + 1];

        int totalProfit = 0;

        // Schedule jobs
        for (Job job : jobs) {

            // Start from latest possible slot
            for (int j = job.deadline; j >= 1; j--) {

                if (slot[j] == null) {

                    slot[j] = job.id;
                    totalProfit += job.profit;

                    break;
                }
            }
        }

        // Print schedule
        System.out.println("Selected Jobs:");

        for (int i = 1; i <= maxDeadline; i++) {
            if (slot[i] != null) {
                System.out.println(
                        "Slot " + i + " -> " + slot[i]);
            }
        }

        System.out.println("Maximum Profit = " + totalProfit);
    }
}