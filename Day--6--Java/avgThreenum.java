import java.util.Scanner;

public class avgThreenum {
    public static double avgThree(double a, double b, double c) {
        double d;
        d = (a + b + c) / 3;

        System.out.print("The Average of Three Number is  : " + d);
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter Second Number : ");
        double num2 = sc.nextDouble();
        System.out.print("Enter Third Number : ");
        double num3 = sc.nextDouble();
        avgThree(num1, num2, num3);
        sc.close();
    }

}
