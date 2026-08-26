
// Question2:Inaprogram,input the side of a square.You have to out put the area of the square
import java.util.*;

public class AreaSquare {
    public static void main(String[] args) {
        System.out.print("Enter the Are of Square : ");
        Scanner sc = new Scanner(System.in);
        Float input = sc.nextFloat();
        float result = input * input;
        System.out.println("Your Result is :" + result);
        sc.close();

    }

}