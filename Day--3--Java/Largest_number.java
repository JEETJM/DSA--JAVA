import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        System.out.print("Enter Your First Number : ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.print("Enter Your Second Number : ");
        Scanner sc1 = new Scanner(System.in);
        Double b = sc1.nextDouble();
        if (a > b) {
            System.out.print("First Number is Largest Largest Than Second Number !" + a);
        } else {
            System.out.print("Second Number is Largest Thane First Number " + b);
        }
        sc.close();
        sc1.close();

    }

}