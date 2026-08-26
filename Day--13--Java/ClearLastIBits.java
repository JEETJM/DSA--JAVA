import java.util.Scanner;

public class ClearLastIBits {

    public static int clearLastIBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number n: ");
        int n = sc.nextInt();

        System.out.print("Enter how many last bits to clear i: ");
        int i = sc.nextInt();

        int result = clearLastIBits(n, i);

        System.out.println("Original number: " + n);
        System.out.println("After clearing last " + i + " bits: " + result);

        sc.close();
    }
}