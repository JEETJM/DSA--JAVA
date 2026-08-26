import java.util.Scanner;

public class ClearIthBit {

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number n: ");
        int n = sc.nextInt();

        System.out.print("Enter bit position i: ");
        int i = sc.nextInt();

        int result = clearIthBit(n, i);

        System.out.println("Original number: " + n);
        System.out.println("After clearing " + i + "th bit: " + result);

        sc.close();
    }
}