
import java.util.*;

public class product {
    public static void main(String[] args) {
        System.out.print("Please Enter the First value : \n");
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        System.out.print("Please Enter the Second Value : \n");
        Scanner sc1 = new Scanner(System.in);
        double input1 = sc1.nextDouble();
        double Result = input * input1;
        System.out.print("Your Product Result is : " + Result);
        sc.close();
        sc1.close();

    }
}
