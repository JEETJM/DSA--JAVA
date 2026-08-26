import java.util.Scanner;

public class ClearBitsInRange {

    public static int clearBitsInRange(int n, int i, int j) {
        int a = (~0) << (j + 1);   // j এর পরের সব bit 1, j থেকে নিচে 0
        int b = (1 << i) - 1;      // i এর আগের সব bit 1
        int bitMask = a | b;       // i থেকে j পর্যন্ত 0, বাকি সব 1
        return n & bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number n: ");
        int n = sc.nextInt();

        System.out.print("Enter starting bit position i: ");
        int i = sc.nextInt();

        System.out.print("Enter ending bit position j: ");
        int j = sc.nextInt();

        int result = clearBitsInRange(n, i, j);

        System.out.println("Original number: " + n);
        System.out.println("After clearing bits from " + i + " to " + j + ": " + result);

        sc.close();
    }
}