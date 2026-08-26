import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int store = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int multi_store = store * i;
            System.out.println(store + " x " + i + " = " + multi_store);
        }

        sc.close();
    }
}



















