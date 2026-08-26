import java.util.*;

public class BuySellStock {

    public static int maxProfit(int prices[]) {

        int buyPrice = Integer.MAX_VALUE; // lowest price
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int prices[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter price for day " + i + ": ");
            prices[i] = sc.nextInt();
        }

        int result = maxProfit(prices);

        System.out.println("Maximum Profit = " + result);

        sc.close();
    }
}