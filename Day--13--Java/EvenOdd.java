import java.util.Scanner;

public class EvenOdd {
    public static void checkEvnOdd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0)
            System.out.print("This is a Even Number , ");
        else
            System.out.println("This is a Odd Number . ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to Check Even OR Odd : ");
        int store = sc.nextInt();
        checkEvnOdd(store);
        sc.close();
    }
}
