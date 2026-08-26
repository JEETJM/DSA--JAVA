import java.util.Scanner;

public class BitManipulationQuestions {

    public static void xorSameNumber(int x) {
        System.out.println("x ^ x = " + (x ^ x));
    }

    public static void swapUsingXOR(int a, int b) {
        System.out.println("Before Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void addOneUsingBits(int n) {
        int result = -~n;
        System.out.println(n + " + 1 = " + result);
    }

    public static void uppercaseToLowercase(char ch) {
        char lower = (char) (ch | ' ');
        System.out.println("Lowercase = " + lower);
    }

    public static void uppercaseStringToLowercase(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch | ' ');
            }

            result.append(ch);
        }

        System.out.println("Lowercase String = " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x: ");
        int x = sc.nextInt();
        xorSameNumber(x);

        System.out.print("Enter first number a: ");
        int a = sc.nextInt();

        System.out.print("Enter second number b: ");
        int b = sc.nextInt();
        swapUsingXOR(a, b);

        System.out.print("Enter a number to add 1: ");
        int n = sc.nextInt();
        addOneUsingBits(n);

        System.out.print("Enter an uppercase character: ");
        char ch = sc.next().charAt(0);
        uppercaseToLowercase(ch);

        System.out.print("Enter an uppercase string: ");
        String str = sc.next();
        uppercaseStringToLowercase(str);

        sc.close();
    }
}