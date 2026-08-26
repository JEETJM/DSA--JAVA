import java.util.Scanner;

public class GetIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();

        System.out.println("Enter bit position i:");
        int i = sc.nextInt();

        int bitMask = 1 << i;

        if ((n & bitMask) == 0) {
            System.out.println(i + "th bit is 0");
        } else {
            System.out.println(i + "th bit is 1");
        }

        sc.close();
    }
}