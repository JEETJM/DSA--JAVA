import java.util.Scanner;

public class binaryToDecimal {

    public static void bintoDecimal(int binNum) {

        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDig = binNum % 10;
            decNum = decNum + (lastDig * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }

        System.out.print("Decimal of " + myNum + " is : " + decNum);
    }

    public static void main(String[] args) {
        System.out.print("Enter a Binary Number: ");
        Scanner sc = new Scanner(System.in);

        int store = sc.nextInt();
        bintoDecimal(store);
        sc.close();
    }
}