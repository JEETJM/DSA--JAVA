import java.util.Scanner;

public class even_Odd {
    public static void main(String[] args) {
        System.out.print("Enter Your Number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.print("Your Given input number is EVEN !! ");
        } else {
            System.out.print("Your Given Input is ODD !! ");
        }
        sc.close();
        // sc1.close();

    }

}