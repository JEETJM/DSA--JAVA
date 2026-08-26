import java.util.Scanner;

public class FriendsPairing {

    static int pairing(int n) {

        // Base Case
        if(n == 1 || n == 2) {
            return n;
        }

        // Single
        int single = pairing(n - 1);

        // Pair
        int pair = (n - 1) * pairing(n - 2);

        // Total
        return single + pair;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of friends : ");

        int n = sc.nextInt();

        System.out.println("Total Ways = " + pairing(n));

        sc.close();
    }
}