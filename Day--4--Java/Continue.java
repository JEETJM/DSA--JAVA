import java.util.Scanner;

public class Continue {
    public static void main(String[] args)

    {
        System.out.print("Enter The Number : ");
        Scanner sc = new Scanner(System.in);

        int store = sc.nextInt();
        for (int i = 1; i <= store; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);

        }
        sc.close();
    }
}
