import java.util.Scanner;

public class decimalToBinay {

    public static void decToBin(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }

        System.out.println("Binary of " + myNum + " is : " + binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal Number: ");
        int n = sc.nextInt();

        decToBin(n);

        sc.close();
    }
}