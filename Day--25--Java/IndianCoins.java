import java.util.*;

public class IndianCoins {

    public static void main(String[] args) {

        Integer coins[] = {
                1, 2, 5, 10, 20, 50, 100, 500, 2000
        };

        int amount = 196;
        int count = 0;

        Arrays.sort(coins, Collections.reverseOrder());

        for (int i = 0; i < coins.length; i++) {

            while (coins[i] <= amount) {

                amount -= coins[i];
                count++;

                System.out.println("Taken: " + coins[i]);
            }
        }

        System.out.println("Minimum Coins/Notes = " + count);
    }
}