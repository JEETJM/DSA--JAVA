
import java.util.Stack;

public class Stocks_Spans {

    static void stockSpan(int price[], int span[]) {

        Stack<Integer> s = new Stack<>();

        // First day
        span[0] = 1;
        s.push(0);

        // Remaining days
        for (int i = 1; i < price.length; i++) {

            // Remove prices smaller than or equal to
            // current price
            while (!s.isEmpty()
                    && price[s.peek()] <= price[i]) {

                s.pop();
            }

            // No previous greater element
            if (s.isEmpty()) {

                span[i] = i + 1;

            } else {

                // Previous greater element exists
                span[i] = i - s.peek();
            }

            // Store current index
            s.push(i);
        }
    }

    public static void main(String[] args) {

        int price[] = {
                100, 80, 60, 70, 60, 75, 85
        };

        int span[] = new int[price.length];

        stockSpan(price, span);

        System.out.println("Prices:");

        for (int i = 0; i < price.length; i++) {
            System.out.print(price[i] + " ");
        }

        System.out.println();

        System.out.println("Span:");

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}