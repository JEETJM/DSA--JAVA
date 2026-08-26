import java.util.Scanner;

public class UpdateIthBit {

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number n: ");
        int n = sc.nextInt();

        System.out.print("Enter bit position i: ");
        int i = sc.nextInt();

        System.out.print("Enter new bit 0 or 1: ");
        int newBit = sc.nextInt();

        if (newBit != 0 && newBit != 1) {
            System.out.println("Invalid input! New bit must be 0 or 1.");
        } else {
            int result = updateIthBit(n, i, newBit);

            System.out.println("Original number: " + n);
            System.out.println("After updating " + i + "th bit to " + newBit + ": " + result);
        }

        sc.close();
    }
}