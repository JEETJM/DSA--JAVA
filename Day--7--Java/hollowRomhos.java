
import java.util.Scanner;

public class hollowRomhos {
    public static void hollowRom(int n) {
        for (int i = 1; i <= n; i++)

        {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= n; k++) {
                if (i == 1 || k==n || k==1 || i==n ) {
                    System.out.print("*");

                }
                else{
                    System.out.print( " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int store = sc.nextInt();
        hollowRom(store);
        sc.close();
    }

}
