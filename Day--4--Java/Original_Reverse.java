
public class Original_Reverse {

    // public class Last_dig_of_n {
    public static void main(String[] args) {
        int Org_Reverse = 1904859;
        // System.out.print("Enter a Number Which Numbe r You Want to Reverse : ");
        // Scanner sc = new Scanner(System.in);

        // int store = sc.nextInt();
        int revNum = 0;
        while (Org_Reverse > 0) {
            int lastDigit = Org_Reverse % 10;
            revNum = (revNum * 10) + lastDigit;
            Org_Reverse = Org_Reverse / 10;
            // System.out.println(Org_Reverse); 

        }
        System.out.println(revNum);
        // System.out.println(Org_Reverse);

        // sc.close();
    }
}
