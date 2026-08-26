import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("WELCOME TO OUR CALCULATOR CHANNEL ");
        System.out.println("Please Enter the First Number ");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        System.out.println("Please Enter the Second Number ");
        Scanner sc1 = new Scanner(System.in);
        double num2 = sc1.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        double result;

        // Switch case
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error! Division by zero");
                }
                break;

            default:
                System.out.println("Invalid operator");
        }

        sc.close();
        sc1.close();
    }
}
