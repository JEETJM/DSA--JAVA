import java.util.Scanner;

public class Week {
    // public class Switch_case {
    public static void main(String[] args) {
        System.out.println("Enter week number(1-7): ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid input ! Please enter week number between 1-7.");
        }
        sc.close();
    }
}
