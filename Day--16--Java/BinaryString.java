import java.util.Scanner;

public class BinaryString {

    static void printBinary(int n,
                            int lastPlace,
                            String str) {

        // Base Case
        if(n == 0) {

            System.out.println(str);

            return;
        }

        // Place 0
        printBinary(n - 1,0, str + "0");

        // Place 1
        if(lastPlace == 0) {

            printBinary(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N : ");

        int n = sc.nextInt();

        printBinary(n, 0, "");

        sc.close();
    }
}