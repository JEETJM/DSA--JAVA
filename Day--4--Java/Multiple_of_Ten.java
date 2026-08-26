import java.util.Scanner;

public class Multiple_of_Ten {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter Number: ");
            int num = sc.nextInt();

            if (num % 10 == 0) {
                System.out.println("Stopped! Multiple of 10 entered.");
                break;
            }

            System.out.println("You entered: " + num);

        } while (true);

        sc.close();
    }
}