import java.util.Scanner;

public class largest_Three {
    public static void main(String[] args) {
        System.out.print("Enter the First Number :");
        Scanner First = new Scanner(System.in);
        double First1 = First.nextDouble();
        System.out.print("Enter the First Number :");
        Scanner Second = new Scanner(System.in);
        double Second1 = Second.nextDouble();
        System.out.print("Enter the First Number :");
        Scanner Third = new Scanner(System.in);
        double Third1 = Third.nextDouble();
        System.out.println("Your All Given Input is : " + First1 + "   " + Second1 + "   " + Third1);
        if (First1 >= Second1 && First1 >= Third1) {
            System.out.print("First Number is Greter than Second and Third " + " " + "The Number is : " + First1);
        } else if (Second1 >= Third1) {
            System.out.print("Second Number is Greter than First ans Third" + " " + "The Number is : " + Second1);
        } else {
            System.out.print("Third Number is Greter than First ans Second" + "The Number is : " + Third1);
        }
        First.close();
        Second.close();
        Third.close();
    }

}
