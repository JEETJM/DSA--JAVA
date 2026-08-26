import java.util.*;
import java.util.LinkedList;
public class First_Non_Repeating_Character {
    public static void main(String[] args) {

        String str = "aabbcdde";

        int freq[] = new int[26];

        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Increase frequency
            freq[ch - 'a']++;

            // Add to queue
            q.add(ch);

            // Remove repeating characters
            while (!q.isEmpty() &&
                    freq[q.peek() - 'a'] > 1) {

                q.remove();
            }

            // First non-repeating character
            if (q.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
    }
}