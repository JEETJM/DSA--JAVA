import java.util.Scanner;

public class income_Tax {
    public static void main(String[] args) {
        System.out.print("Enter Your Salary Income : ");
        Scanner sc = new Scanner(System.in);
        int Salary_Store = sc.nextInt();
        if (Salary_Store < 500000) {
            System.out.print("Be happy !! No tax Needed");
        } else if (Salary_Store >= 500000 && Salary_Store <= 1000000)
        {
            System.out.print("So sad 20% TAX You must need to pay , Your Tax is : " + (int) (Salary_Store * 0.2));
        } else {
            System.out.print(
                    "So very Sad 30% TAX You must  to need to pay , Your Tax is : " + (int) (Salary_Store * 0.3));
        }
        sc.close(); 
    }

}
