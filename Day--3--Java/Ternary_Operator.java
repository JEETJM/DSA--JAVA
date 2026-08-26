import java.util.Scanner;

public class Ternary_Operator {
    public static void main(String[] args) {
        // int age = 20;

        // String result = (age >= 18) ? "Adult" : "Minor";

        // System.out.println(result);

        System.out.print("Enter Your Exam Marks  : ");
        Scanner sc = new Scanner(System.in);
        int Store_Marks = sc.nextInt();
        String result = (Store_Marks >= 33) ? "Congrats U Pass" : "So sad U Fail !";
        System.out.print(result);
        sc.close();
    }
}