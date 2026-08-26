import java.util.*;

public class FractionalKnapsack {

    static class Item {
        int value;
        int weight;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {

        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };

        int capacity = 50;

        Item items[] = new Item[value.length];

        for (int i = 0; i < value.length; i++) {
            items[i] = new Item(value[i], weight[i]);
        }

        // Sort by value/weight ratio in descending order
        Arrays.sort(items, (a, b) -> Double.compare(
                (double) b.value / b.weight,
                (double) a.value / a.weight));

        double maxValue = 0;

        for (Item item : items) {

            if (capacity >= item.weight) {

                // Take complete item
                maxValue += item.value;
                capacity -= item.weight;

            } else {

                // Take fraction
                maxValue += ((double) item.value / item.weight) * capacity;

                capacity = 0;
                break;
            }
        }

        System.out.println("Maximum Value = " + maxValue);
    }
}