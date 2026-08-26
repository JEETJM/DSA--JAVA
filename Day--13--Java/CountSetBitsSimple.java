import java.util.Scanner;

public class CountSetBitsSimple {
    public static int countSetBits(int n) {
        int count = 0;

        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }

            n = n >> 1;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Binary = " + Integer.toBinaryString(n));
        System.out.println("Count of set bits = " + countSetBits(n));

        sc.close();
    }
}